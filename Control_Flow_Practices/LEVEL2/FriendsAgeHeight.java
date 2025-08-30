import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Amar's age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int height1 = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int height2 = sc.nextInt();


        System.out.print("Enter Anthony's age: ");
        int age3 = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int height3 = sc.nextInt();

        if (age1 <= age2 && age1 <= age3)
            System.out.println("The youngest is Amar (" + age1 + " years).");
        else if (age2 <= age1 && age2 <= age3)
            System.out.println("The youngest is Akbar (" + age2 + " years).");
        else
            System.out.println("The youngest is Anthony (" + age3 + " years).");


        if (height1 >= height2 && height1 >= height3)
            System.out.println("The tallest is Amar (" + height1 + " cm).");
        else if (height2 >= height1 && height2 >= height3)
            System.out.println("The tallest is Akbar (" + height2 + " cm).");
        else
            System.out.println("The tallest is Anthony (" + height3 + " cm).");
    }
}
