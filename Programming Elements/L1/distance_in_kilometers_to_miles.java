import java.util.Scanner;

public class distance_in_kilometers_to_miles {
    public static void main(String[] args) {
        double km;
        double miles;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // 1 mile = 1.6 km => 1 km = 1/1.6 miles
        miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
