public class Employee {

    public static Employee employee;
    private Employee() {
    }

    public static void display(){
        System.out.println("Calling disply method");
    }

    public static Employee getInstance(){
        if(employee==null) {
            employee = new Employee();
        }
        return employee;
    }
}
