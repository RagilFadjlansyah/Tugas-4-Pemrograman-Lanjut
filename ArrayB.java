import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayB {
    public static void main(String[] args) {

        int []  ArrayB = {
                82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,
        };
        int b = IntStream.of(ArrayB) .sum();
        System.out.println("Jumlah Keseluruhan angka yaitu :" +b);
    }
}
