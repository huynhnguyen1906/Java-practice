package lab02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter number a
        System.out.println("enter number a:");
        int a = Integer.parseInt(scanner.nextLine());

        // enter number b
        System.out.println("enter number b:");
        int b = Integer.parseInt(scanner.nextLine());

        // enter bumber c
        System.out.println("enter bumber c:");
        int c = Integer.parseInt(scanner.nextLine());

        // calculate x
        if (a != 0) {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                System.out.println("no solution");
            }
        } else if (b != 0) {
            double x = (double) -c / b;
            System.out.println("x = " + x);
        } else {
            if (c == 0) {
                System.out.println("x = all real numbers");
            } else {
                System.out.println("no solution");
            }
        }

        scanner.close();
    }
}