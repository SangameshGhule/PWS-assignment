public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee employee= Employee.getInstance();
        System.out.println(employee.hashCode());
        Employee.display();
        employee.display();

        Employee employee1= Employee.getInstance();
        System.out.println(employee1.hashCode());
        employee.display();
    }
}