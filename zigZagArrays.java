import java.util.Arrays;
import java.util.Scanner;

public class zigZagArrays {
    //Write a program that creates 2 arrays.
    // You will be given an integer n. On the next n lines, you get 2 integers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (i % 2 != (double)0){
                array1[i] = num1;
                array2[i] = num2;
            }else{
                array1[i] = num2;
                array2[i] = num1;
            }
        }
        System.out.println(Arrays.toString(array2).replace("[","").replace("]","").replace(",",""));
        System.out.println(Arrays.toString(array1).replace("[","").replace("]","").replace(",",""));

    }
}
