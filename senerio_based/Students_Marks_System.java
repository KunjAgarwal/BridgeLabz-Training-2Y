import java.util.Scanner;

public class Students_Marks_System {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Marks in 3 subjects (e.g., 78 85 90): ");
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); 

            students[i] = new Student(name, rollNo, marks);
        }

        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}

class Student {
    private String name;
    private int rollNo;
    private int[] marks;

    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + (i < marks.length - 1 ? ", " : ""));
        }
        System.out.println("\nTotal Marks: " + calculateTotalMarks());
    }
}
