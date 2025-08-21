import java.util.Scanner;

// filepath: c:\Users\pulki\OneDrive\Desktop\bridge_lab\Programming_Elements_L1&2\yard_miles.java
public class yard_miles {
    public static void main(String[] args) {
        double feet;
        double yards;
        double miles;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        // 1 yard = 3 feet
        yards = feet / 3;
        // 1 mile = 1760 yards
        miles = yards / 1760;

        System.out.println(
            "The distance is " + feet + " feet, which is " + yards + " yards and " + miles + " miles"
        );
        input.close();
    }
}
