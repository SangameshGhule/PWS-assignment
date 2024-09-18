package CollectCase;

import java.util.*;
import java.util.stream.Collectors;

public class CollectCase {

    public static class Student {
        private String department;
        private String name;
        private Integer age;

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        private String sex;

        public Student(String department, String name, Integer age, String sex) {
            this.department = department;
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', department='" + department + "', age=" + age + "', sex='" + sex + "'}";
        }
    }

    public static void main(String[] args) {

        List<Student> allStudents =new ArrayList<>(Arrays.asList(
                new Student("Computer", "Bob", 18, "male"),
                new Student("Computer", "Ted", 17, "male"),
                new Student("Economics", "Zeka", 19, "male"),
                new Student("Economics", "Alan", 19, "male"),
                new Student( "Computer", "Anne", 21, "female"),
                new Student("Physics", "Davis", 21, "female")
        ));

        filterComputerGroupByStream(allStudents);

        System.out.println("-------------------------");
        groupByDepartmentAndSex(allStudents);

        System.out.println("-------------------------");
        partitioningBySex(allStudents);

        System.out.println("-------------------------");
        getOldestStudentGroup(allStudents);

        System.out.println("-------------------------");
        collectAndThen(allStudents);
    }

    public static void filterComputerDepartmentStudents(List<Student> students) {
        List<Student> computerStudents = students.stream()
                .filter(s -> Objects.equals(s.getDepartment(), "Computer"))
                .collect(Collectors.toList());
        System.out.println(computerStudents);
    }

    public static void filterComputerStudentsGroupBySex(List<Student> students) {
        // step1, filter
        List<Student> computerStudents = students.stream()
                .filter(s -> Objects.equals(s.getDepartment(), "Computer"))
                .collect(Collectors.toList());

        // step2, group
        Map<String, List<Student>> resultMap = new HashMap<>();
        for (Student student : computerStudents) {
            List<Student> groupList = resultMap.computeIfAbsent(student.getDepartment(), s -> new ArrayList<>());
            groupList.add(student);
        }
    }

    public static void filterComputerGroupByStream(List<Student> students) {
        Map<String, List<Student>> resultMap = students.stream()
                .filter(s -> Objects.equals(s.getDepartment(), "Computer"))
                .collect(Collectors.groupingBy(Student::getSex));
        System.out.println(resultMap);

        Map<String, Long> resultMap2 = students.stream()
                .filter(s -> Objects.equals(s.getDepartment(), "Computer"))
                .collect(Collectors.groupingBy(Student::getSex, Collectors.counting()));
        System.out.println(resultMap2);
    }

    public static void groupByDepartmentAndSex(List<Student> students) {
        Map<String, Map<String, Long>> resultMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.groupingBy(Student::getSex,
                                Collectors.counting())));
        System.out.println(resultMap);
    }

    public static void partitioningBySex(List<Student> students) {
        Map<String, Map<Boolean, Long>> resultMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.partitioningBy(s -> Objects.equals(s.getSex(), "male"),
                                Collectors.counting())));
        System.out.println(resultMap);
    }

    public static void getOldestStudentGroup(List<Student> students) {
        Map<String, Map<Boolean, Optional<Student>>> resultMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.partitioningBy(s -> Objects.equals(s.getSex(), "male"),
                                Collectors.maxBy(Comparator.comparing(Student::getAge)))));
        System.out.println("The oldest male student in the Computer Department is: "
                + resultMap.get("Computer").get(true).map(Student::getAge).orElse(0));
    }

    public static void collectAndThen(List<Student> students) {
        Map<String, Map<Boolean, Integer>> resultMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.partitioningBy(s -> Objects.equals(s.getSex(), "male"),
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getAge)),
                                        a -> a.map(Student::getAge).orElse(0)))));
        System.out.println(resultMap);
        System.out.println("The oldest male student in the Computer Department is: " + resultMap.get("Computer").get(true));
    }

}