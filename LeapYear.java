import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Nested if-else logic
        if (year % 100 == 0) {  // Century year
            if (year % 400 == 0) {
                System.out.println("Leap Century Year");
            } else {
                System.out.println("Century Year");
            }
        } else {  // Not a century year
            if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Ordinary Year");
            }
        }

        sc.close();
    }
}

