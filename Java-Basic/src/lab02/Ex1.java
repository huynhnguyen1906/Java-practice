package lab02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter number a:");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer for a");
                return;
            }
            int a = scanner.nextInt();

            // enter number b
            System.out.println("enter number b:");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer for b");
                return;
            }
            int b = scanner.nextInt();

            // calculate x
            if (a > 0) {
                double x = (double) -b / a;
                System.out.println("x = " + x);
            } else if (a == 0) {
                if (b == 0) {
                    System.out.println("x = all real numbers");
                } else {
                    System.out.println("x = no solution");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}