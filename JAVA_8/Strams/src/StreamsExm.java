//import Student.Student;
//
//import javax.swing.*;
//import java.util.List;
//
//public class StreamsExm {
//
//    List<Student> allStudents = List(
//            new Student("Computer", "Bob", 18, "male"),
//            new Student("Computer", "Ted", 17, "male"),
//            new Student("Economics", "Zeka", 19, "male"),
//            new Student("Economics", "Alan", 19, "male"),
//            new Student( "Computer", "Anne", 21, "female"),
//            new Student("Physics", "Davis", 21, "female")
//    );
//
//    public static void main(String[] args) {
//        Map<String, List<Student>> resultMap = students.stream()
//                .filter(s -> Objects.equals(s.getDepartment(), "Computer"))
//                .collect(Collectors.groupingBy(Student::getSex));
//        System.out.println(resultMap);
//    }
//}
