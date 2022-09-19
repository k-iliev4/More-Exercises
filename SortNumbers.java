import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        Integer[] array = {num1,num2,num3};

        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}
