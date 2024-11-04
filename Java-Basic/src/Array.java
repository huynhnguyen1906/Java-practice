import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] clubs = { "MU", "Mancity", "liverpool" };
        System.out.println("run array" + Arrays.toString(clubs));

        clubs[0] = "Chelsea";

        System.out.println("run array" + Arrays.toString(clubs));

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
