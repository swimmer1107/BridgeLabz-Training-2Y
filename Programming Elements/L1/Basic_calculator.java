import java.util.Scanner;

public class Basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble(); // First number

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble(); // Second number

        double sum = num1 + num2;          // Addition
        double difference = num1 - num2;   // Subtraction
        double product = num1 * num2;      // Multiplication
        double quotient = num1 / num2;     // Division

        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers " +
            num1 + " and " + num2 + " is " +
            sum + ", " + difference + ", " + product + ", and " + quotient
        );
    }
}
