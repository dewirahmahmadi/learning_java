import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        // Arrays class berisikan static method yang digunakan untuk
        //memanipulasi data array, seperti pencarian dan pengurutan

        int[] number = {
                1,2,34,5,6,7,43,2,3,5,6
        };

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number, 7));

        int[] copy = Arrays.copyOf(number, 5);
        System.out.println(Arrays.toString(copy));
    }
}
