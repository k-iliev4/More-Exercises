import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        //Write a program to find all the top integers in an array.
        //A top integer is an integer that is bigger than all the elements to its right
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] array = new int[strArray.length];
        boolean topInteger = false;
        int lastOne = 0;

        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            topInteger = false;
            lastOne = array[array.length-1];
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] > array[j + 1]){
                    topInteger = true;
                }else{
                    topInteger = false;
                    break;
                }
            }
            if (topInteger){
                System.out.println(array[i]);
            }
        }
        System.out.println(lastOne);
    }
}
