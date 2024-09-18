public class Main {
    public static void main(String[] args) {
//        Employee employee= new AndroidDeveloperSalary();
//        System.out.println(employee.getSalary());

        Employee employee= new AndroidDeveloperSalary();
        employee.getSalary();


        Employee webDeveloper = EmployeeFactoryMethods.getDesignationBAsedSalary("WebDeveloper");
        System.out.println(" Web Developer salary: " + webDeveloper.getSalary());

        Employee webDeveloper1 = EmployeeFactoryMethods.getDesignationBAsedSalary("AndroidDeveloperSalary");
        System.out.println(" AndroidDeveloper salary: " + webDeveloper1.getSalary());
    }
}