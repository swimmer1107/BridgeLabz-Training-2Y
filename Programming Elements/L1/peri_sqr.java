import java.util.Scanner;

public class peri_sqr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        int perimeter = input.nextInt();

        int sideLength = perimeter / 4;

        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);
        input.close();
    }
}
