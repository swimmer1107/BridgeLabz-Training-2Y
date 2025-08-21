public class divide_equally_among {
    public static void main(String[] args) {
        int totalPens = 14; // Total pens to be divided
        int numberOfStudents = 3; // Number of students

        int pensPerStudent = totalPens / numberOfStudents; // Pens each student gets
        int remainingPens = totalPens % numberOfStudents;   // Pens not distributed

        System.out.println(
            "The Pen Per Student is " + pensPerStudent +
            " and the remaining pen not distributed is " + remainingPens
        );
    }
}
