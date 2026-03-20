import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. if Statement
        // Used when you want to execute code only if a condition is true

        // Example
        int age = 18;
        if (age >= 18) {
            System.out.println("You can vote");
        }

        // 2. if-else Statement
        // Used when you want two possible outcomes

        // Example
        int rollNo = 16;
        if (rollNo >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        // 3. if-else-if Ladder
        // Used for multiple conditions

        // Example
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // 4.Ternary Operator (? :)
        // Shortcut for if-else (used in one line)

        // Example
        int age1 = 20;

        String result = (age1 >= 18) ? "Adult" : "Minor";
        System.out.println(result);

        // 5.switch Statement

        // Used when you have multiple fixed options

        // Example
        System.out.print("enter the day(1-9): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrushday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}
