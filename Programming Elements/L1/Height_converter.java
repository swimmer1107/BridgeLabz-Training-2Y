import java.util.Scanner;

public class Height_converter {
    public static void main(String[] args) {
        double cm;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        cm = input.nextDouble();

        double totalInches = cm / 2.54; // 1 inch = 2.54 cm
        int feet = (int)(totalInches / 12); // 1 foot = 12 inches
        double inches = totalInches % 12;

        System.out.println(
            "Your Height in cm is " + cm +
            " while in feet is " + feet +
            " and inches is " + inches
        );
    }
}
