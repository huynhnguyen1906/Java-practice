package lab02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter used electricity
        System.out.println("enter used electricity:");
        int usedElectricity = Integer.parseInt(scanner.nextLine());

        // calculate electricity bill
        if (usedElectricity <= 100) {
            System.out.println("electricity bill: " + usedElectricity * 1000);
        } else {
            System.out.println("electricity bill: " + usedElectricity * 1500);
        }

        scanner.close();
    }
}