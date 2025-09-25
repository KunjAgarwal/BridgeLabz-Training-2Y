public class Employee_Management {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "E101", "Software Engineer");
        Employee employee2 = new Employee("Jane Smith", "E102", "Project Manager");

        System.out.println("--- Employee Details ---");
        employee1.displayDetails();
        System.out.println();
        employee2.displayDetails();
        System.out.println();
        System.out.println("--- Instanceof Check ---");
        Object anObject = employee1;
        if (anObject instanceof Employee) {
            Employee employee = (Employee) anObject;
            System.out.println("Object is an instance of Employee. Displaying details:");
            employee.displayDetails();
        } else {
            System.out.println("Object is not an instance of Employee.");
        }
        System.out.println();
        Employee.displayTotalEmployees();
    }
}
class Employee {
    private static String companyName = "CodInClub";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
    }
    public static void displayTotalEmployees() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Employees: " + totalEmployees);
    }
}
