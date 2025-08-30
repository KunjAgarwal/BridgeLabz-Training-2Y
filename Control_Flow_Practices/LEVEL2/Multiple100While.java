import java.util.Scanner;

public class Multiple100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Number should be positive and less than 100.");
            return;
        }

        int counter = number - 1;

        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(counter);
                counter--;
                continue;
            }
            counter--;
        }
    }
}
