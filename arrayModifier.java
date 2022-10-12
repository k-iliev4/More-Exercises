import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You are given an array with integers. Write a program to modify the elements after receiving the following commands:
        //• "swap {index1} {index2}" takes two elements and swap their places.
        //• "multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
        //• "decrease" decreases all elements in the array with 1.

        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] array = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        String command = scanner.next();
        int tempHolder = 0;

        while(!command.equals("end")){

            if (command.equals("swap")){
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                tempHolder = array[num1];
                array[num1] = array[num2];
                array[num2] = tempHolder;
            }
            if (command.equals("multiply")){
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                tempHolder = array[num1] * array[num2];
                array[num1] = tempHolder;
            }
            if (command.equals("decrease")){
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] - 1;
                }
            }
            command = scanner.next();
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }
}
