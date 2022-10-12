import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.

        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] array = new int[strArray.length];
        int magicNumber = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == magicNumber) {
                    System.out.print(array[i] + " " + array[j] + "\n");

                }
            }
        }
    }
}
