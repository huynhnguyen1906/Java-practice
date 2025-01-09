package lab03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Factor: " + i);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.printf("Prime number", number);
        } else {
            System.out.printf("Not a prime number", number);
        }
        scanner.close();
    }
}
