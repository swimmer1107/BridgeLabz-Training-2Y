import java.util.Scanner;

public class Convert_Km_to_miles {
    public static void main(String[] args) {
        double kmToMilesConversionFactor = 0.621371; // 1 kilometer = 0.621371 miles

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers * kmToMilesConversionFactor;

        // Print the converted distance
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
    
}