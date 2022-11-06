import java.util.ArrayList;
import java.util.Scanner;

public class anonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You will receive a single input line containing STRINGS separated by spaces.
        //The strings may contain any ASCII character except whitespace.
        //You will then begin receiving commands in one of the following formats:
        //    • merge {startIndex} {endIndex}
        //Whenever you receive the merge command, you must merge all elements from the startIndex to the endIndex.
        // In other words, you should concatenate them.
        //Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}

        String input = scanner.nextLine();
        String[] convertedToArray = input.split(" ");

        String command = scanner.nextLine();

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < convertedToArray.length; i++) {
            arrayList.add(convertedToArray[i]);
        }

        while (!command.equals("3:1")) {
            String[] commandArray = command.split(" ");

            boolean smaller = true;

            if (commandArray[0].equals("merge")) {
                int temp1 = Integer.parseInt(commandArray[1]);
                int temp2 = Integer.parseInt(commandArray[2]);
                while (smaller) {
                    if (temp1 < arrayList.size() && temp2 < arrayList.size()) {
                        smaller = false;
                        for (int i = temp1 + 1; i <= temp2; i++) {
                            arrayList.set(temp1, arrayList.get(temp1) + arrayList.get(i));
                        }
                        for (int i = temp1 + 1; i <= temp2; i++) {
                            int toBeRemoved = temp1 + 1;
                            arrayList.remove(toBeRemoved);
                        }
                    }else {
                        if (temp1 > 0){
                            temp1 -= 1;
                        }
                        if (temp2 > 0){
                            temp2 -= 1;
                        }
                    }
                }
            }

            command = scanner.nextLine();
        }

    }
}
