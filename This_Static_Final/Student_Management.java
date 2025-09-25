public class Student_Management {
public static void main(String[] args) {
        Student student1 = new Student("Alice", "S101", "A");
        Student student2 = new Student("Bob", "S102", "B");
        System.out.println("--- Student Details ---");
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        System.out.println("--- Instanceof Check ---");
        Object anObject = student1;
        if (anObject instanceof Student) {
            Student student = (Student) anObject;
            System.out.println("Object is an instance of Student. Displaying details:");
            student.displayDetails();
        } else {
            System.out.println("Object is not an instance of Student.");
        }
        System.out.println();
        Student.displayTotalStudents();
    }
}
class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
    }
    public static void displayTotalStudents() {
        System.out.println("University Name: " + universityName);
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}
