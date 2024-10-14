package lab02;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter number a
        System.out.println("enter number a:");
        int a = scanner.nextInt();
        // enter number b
        System.out.println("enter number b:");
        int b = scanner.nextInt();
        scanner.close();
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
    }
}
