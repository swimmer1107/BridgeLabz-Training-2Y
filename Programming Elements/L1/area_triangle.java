import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        double base, height;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        height = input.nextDouble();

        // Area of triangle in square centimeters
        double areaCm = 0.5 * base * height;
        // 1 square inch = 6.4516 square cm
        double areaInch = areaCm / 6.4516;

        System.out.println(
            "The area of triangle with base " + base + " cm and height " + height + " cm is " +
            areaCm + " square centimeters and " + areaInch + " square inches"
        );
    }
}

