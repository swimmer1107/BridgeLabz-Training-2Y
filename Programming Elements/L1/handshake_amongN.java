import java.util.Scanner;

public class handshake_amongN {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Maximum number of handshakes = n * (n - 1) / 2
        int handshakes = numberOfStudents * (numberOfStudents - 1) / 2;

        System.out.println(
            "The total number of handshakes among " + numberOfStudents + " students is: " + handshakes
        );
        input.close();
    }
}
