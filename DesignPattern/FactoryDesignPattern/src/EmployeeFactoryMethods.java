public class EmployeeFactoryMethods {
    public static Employee getAllEmployees(String empType){
        if(empType.trim().equalsIgnoreCase("AndroidDeveloperSalary")){
            return new AndroidDeveloperSalary();
        }else if(empType.trim().equalsIgnoreCase("WebDeveloper")) {
            return new WebDeveloper();
        }else {
            throw new RuntimeException("Employee not found");
        }
    }
}
