import java.util.Scanner;

public class AvgMarksPcm {
    public static void main(String[] args) {
        int totalMarks = 0;
        int numberOfSubjects = 3; // PCM subjects: Physics, Chemistry, Mathematics

        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics
        System.out.print("Enter marks for Physics: ");
        totalMarks += scanner.nextInt();

        // Input marks for Chemistry
        System.out.print("Enter marks for Chemistry: ");
        totalMarks += scanner.nextInt();

        // Input marks for Mathematics
        System.out.print("Enter marks for Mathematics: ");
        totalMarks += scanner.nextInt();

        // Calculate average
        double averageMarks = (double) totalMarks / numberOfSubjects;

        // Print the average marks
        System.out.println("Average marks in PCM: " + averageMarks);
    }
}
