package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array is" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("The sorted array is" + Arrays.toString(arr));
        System.out.println("The smallest element is " + arr[0]);
        System.out.println("The largest element is " + arr[size - 1]);
        scanner.close();

    }
}
