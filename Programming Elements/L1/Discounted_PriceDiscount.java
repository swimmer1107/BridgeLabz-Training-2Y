public class Discounted_PriceDiscount {
    public static void main(String[] args) {
        double fee = 125000.0; // Course fee
        double discountPercent = 10.0; // Discount percent

        double discount = (fee * discountPercent) / 100; // Discount amount
        double finalFee = fee - discount; // Discounted fee

        System.out.println(
            "The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee
        );
    }
}
