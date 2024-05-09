public class Operator {
    public static void main(String[] args) throws Exception {
        int a = 6;
        int b = 9;
        int c = a + b;
        System.out.println("Sum: " + c);
        int d = a - b;
        System.out.println("Difference: " + d);
        int e = a * b;
        System.out.println("Product: " + e);
        int f = a / b;
        System.out.println("Quotient: " + f);
        int g = a % b;
        System.out.println("Remainder: " + g);
        int x = 5;
        int y = 10;
        System.out.println(x > y);
        System.out.println(x < y && x != y);
    }
}
