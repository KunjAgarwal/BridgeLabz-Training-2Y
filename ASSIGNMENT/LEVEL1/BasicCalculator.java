import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter University Discount Percentage: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100.0;
        double feeToPay = fee - discount;
        System.out.println("Fee you have to pay after discount: " + feeToPay);
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
