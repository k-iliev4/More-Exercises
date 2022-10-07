import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that finds the longest sequence of equal elements in an array of integers.
        // If several longest sequences exist, print the leftmost one.

        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        String current;
        int counter = 0;
        int biggestCounter = 0;
        int sequenceCounter = 0;
        String longestSequenceCharacter = " ";

        for (int i = strArray.length - 1; i > 0; i--) {

            current = strArray[i];

            if (strArray[i - 1].equals(current)) {
                counter++;
            } else {
                counter = 0;
            }
            if (biggestCounter <= counter) {
                if (!longestSequenceCharacter.equals(current)) {
                    sequenceCounter = 0;
                }
                longestSequenceCharacter = current;
                biggestCounter = counter;
                sequenceCounter++;
            }
        }
        for (int i = 0; i <= sequenceCounter; i++) {
            System.out.print(longestSequenceCharacter + " ");
        }


    }
}
