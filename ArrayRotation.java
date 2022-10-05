import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        //Write a program that receives an array and the number of rotations you have to perform
        //(the first element goes at the end). Print the resulting array.
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {

            String temp = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];
            }
            array[array.length - 1] = temp;

        }
        System.out.println(Arrays.toString(array));

    }
}
