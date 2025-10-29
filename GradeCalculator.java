import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1, marks2, marks3, marks4, marks5;
        double average;

        // Input marks of 5 subjects
        System.out.print("Enter marks of Subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        marks3 = sc.nextInt();
        System.out.print("Enter marks of Subject 4: ");
        marks4 = sc.nextInt();
        System.out.print("Enter marks of Subject 5: ");
        marks5 = sc.nextInt();

        // Calculate average
        average = (marks1 + marks2 + marks3 + marks4 + marks5) / 5.0;

        // Check if failed in any subject
        if (marks1 < 40 || marks2 < 40 || marks3 < 40 || marks4 < 40 || marks5 < 40) {
            System.out.println("Fail");
        } else {
            // Nested if-else for grade calculation
            if (average >= 90) {
                System.out.println("Grade: A+");
            } else {
                if (average >= 75) {
                    System.out.println("Grade: A");
                } else {
                    if (average >= 60) {
                        System.out.println("Grade: B");
                    } else {
                        if (average >= 40) {
                            System.out.println("Grade: C");
                        } else {
                            System.out.println("Fail");
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
