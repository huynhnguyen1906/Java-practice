import java.util.Scanner;

public class IfElsePractice2 {
    public static void main(String[] args) throws Exception {
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
