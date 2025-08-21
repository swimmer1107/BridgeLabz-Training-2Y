import java.util.Scanner;

public class side_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the side
        double side = perimeter / 4;

        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");

        sc.close();
    }
}
