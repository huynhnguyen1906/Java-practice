package lab02;

public class Ex1 {
    public static void main(String[] args) {
        // enter number a
        System.out.println("enter number a:");
        int a = Integer.parseInt(System.console().readLine());
        // enter number b
        System.out.println("enter number b:");
        int b = Integer.parseInt(System.console().readLine());
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
