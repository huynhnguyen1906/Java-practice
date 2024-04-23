import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws Exception {
        int a = 6;
        int b = 9;
        int c = a + b;
        System.out.println("Sum: " + c);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your age is:");
        int age = scanner.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
        scanner.close();
    }
}