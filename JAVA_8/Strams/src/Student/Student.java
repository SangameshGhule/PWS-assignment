package Student;

public  class Student {
    private String department;
    private String name;
    private Integer age;
    private String sex;

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}