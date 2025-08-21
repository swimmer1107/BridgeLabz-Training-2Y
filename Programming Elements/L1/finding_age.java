import java.util.Scanner;

public class finding_age {
    public static void main(String[] args) {
        int currentYear = 2024; // Current year

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculate age
        int age = currentYear - birthYear;

        // Print the age
        System.out.println("Your age is: " + age);
    }
}
