package lab02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Select menu function
            System.out.println("++ ----------------------------- ++");
            System.out.println(">> Select menu function: <<");
            System.out.println("1. 1st degree equation");
            System.out.println("2. 2nd degree equation");
            System.out.println("3. The electricity bill");
            System.out.println("4. Exit");
            System.out.println("++ ----------------------------- ++");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid menu choice");
                return;
            }
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Ex1.main(args);
                    break;
                case 2:
                    Ex2.main(args);
                    break;
                case 3:
                    Ex3.main(args);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid menu choice.");
        } finally {
            scanner.close();
        }
    }
}