public class Main {
    public static void main(String[] args) {
//        Employee employee= new AndroidDeveloperSalary();
//        System.out.println(employee.getSalary());


        Employee webDeveloper = EmployeeFactoryMethods.getAllEmployees("WebDeveloper");
        System.out.println(" Web Developer salary: " + webDeveloper.getSalary());

        Employee webDeveloper1 = EmployeeFactoryMethods.getAllEmployees("AndroidDeveloperSalary");
        System.out.println(" AndroidDeveloper salary: " + webDeveloper1.getSalary());
    }
}