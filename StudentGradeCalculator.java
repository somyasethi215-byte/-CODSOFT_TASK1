import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student Details
        System.out.println("==================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("==================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of subjects!");
            sc.close();
            return;
        }

        int[] marks = new int[n];
        int total = 0;

        // Input Marks
        for (int i = 0; i < n; i++) {

            System.out.print("Enter marks for Subject "
                    + (i + 1) + " (out of 100): ");

            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter 0-100.");
                i--;
                continue;
            }

            total += marks[i];
        }

        // Calculate Average
        double average = (double) total / n;

        // Calculate Grade
        String grade;

        if (average >= 90) {
            grade = "A+";
        } 
        else if (average >= 80) {
            grade = "A";
        } 
        else if (average >= 70) {
            grade = "B";
        } 
        else if (average >= 60) {
            grade = "C";
        } 
        else if (average >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        // Display Result
        System.out.println("\n==================================");
        System.out.println("          STUDENT RESULT");
        System.out.println("==================================");

        System.out.println("Student Name: " + name);

        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1)
                    + " Marks: " + marks[i]);
        }

        System.out.println("----------------------------------");
        System.out.println("Total Marks: " + total
                + "/" + (n * 100));

        System.out.printf("Average Percentage: %.2f%%\n",
                average);

        System.out.println("Final Grade: " + grade);

        if (average >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        System.out.println("==================================");
        System.out.println("       THANK YOU!");
        System.out.println("==================================");

        sc.close();
    }
}