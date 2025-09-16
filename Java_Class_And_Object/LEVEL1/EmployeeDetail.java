class Employee {
    String name;
    int id;
    double salary;

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetail {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 1001, 55000.0);

        emp1.displayDetails();
    }
}
