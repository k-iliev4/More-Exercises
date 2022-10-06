import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {

        //Write a program that determines if an element exists in the array such that the sum of the
        // elements on its left is equal to the sum of the elements on its right.
        // If there are no elements to the left/right, their sum is considered to be 0.
        // Print the index that satisfies the required condition or "no" if there is no such index.
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] array = new int[strArray.length];
        int leftSum = 0;
        int rightSum = 0;
        boolean match = false;
        int position = 0;

        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = 0; i < array.length; i++) {
            rightSum = 0;
            if (match){
                break;
            }
            position = i + 1;
            leftSum += array[i];
            for (int j = array.length - 1; j > 0 ; j--) {
                rightSum += array[j];
                if (leftSum == rightSum){
                    match = true;
                    break;
                }
            }
        }
        if (match){
            System.out.println(position);
        }

    }
}
