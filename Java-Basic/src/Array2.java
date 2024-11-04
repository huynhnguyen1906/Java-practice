import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] Numbers = { 1, 54, 2, 67, 68, 6, 57, 8, 6 };

        for (int i = 0; i < Numbers.length - 1; i++) {
            for (int j = i + 1; j < Numbers.length; j++) {
                // Swap if the element is greater than the next element
                if (Numbers[i] > Numbers[j]) {
                    int temp = Numbers[i];
                    Numbers[i] = Numbers[j];
                    Numbers[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(Numbers));
    }
}