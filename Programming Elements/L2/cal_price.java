import java.util.Scanner;

// filepath: c:\Users\pulki\OneDrive\Desktop\bridge_lab\Programming_Elements_L1&2\cal_price.java
public class cal_price {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity + " and unit price is INR " + unitPrice
        );
        input.close();
    }
}
