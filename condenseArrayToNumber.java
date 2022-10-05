import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        String[] stringArray = inputText.split(" ");

        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        while(intArray.length > 1){
            int[] condensed = new int[intArray.length - 1];
            for (int i = 0; i < intArray.length-1; i++) {
                condensed[i] = intArray[i] + intArray[i+1];
            }
            intArray = condensed;
        }
        System.out.println(Arrays.toString(intArray).replace("[","").replace("]",""));


    }
}
