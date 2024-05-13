import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) throws Exception {
        int a = 6;
        int b = 9;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = scanner.nextInt();
        scanner.close();
        if (income < 10000) {
            System.out.println("You are poor");
        } else if (income >= 10000 && income < 20000) {
            System.out.println("You are middle class");
        } else {
            System.out.println("You are rich");
        }
    }
}
