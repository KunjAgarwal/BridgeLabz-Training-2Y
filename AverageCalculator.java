import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        // Take three numbers as input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Print the average
        System.out.println("The average is: " + average);
    }
}
}