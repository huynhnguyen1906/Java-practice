package lab02;

public class Ex4 {
    public static void main(String[] args) {
        // Select menu function
        System.out.println("++ ----------------------------- ++");
        System.out.println(">> Select menu function: <<");
        System.out.println("1. 1st degree equation");
        System.out.println("2. 2nd degree equation");
        System.out.println("3. The electricity bill");
        System.out.println("4. Exit");
        System.out.println("++ ----------------------------- ++");
        int choice = Integer.parseInt(System.console().readLine());

        if (choice == 1) {
            Ex1.main(args);
        } else if (choice == 2) {
            Ex2.main(args);

        } else if (choice == 3) {
            Ex3.main(args);

        } else if (choice == 4) {
            System.exit(0);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
