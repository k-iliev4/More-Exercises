import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
        //Add {number}: add a number to the end of the list
        //Remove {number}: remove a number from the list
        //RemoveAt {index}: remove a number at a given index
        //Insert {number} {index}: insert a number at a given index
        //Note: All the indices will be valid!

        List<Integer> arrList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")){
            String[] positions = input.split(" ");

            switch (positions[0]){
                case "Add":
                    arrList.add(Integer.parseInt(positions[1]));
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(positions[1]);

                    for (int i = 0; i < arrList.size(); i++) {
                        if (numberToRemove == arrList.get(i)){
                            arrList.remove(i);
                        }
                    }

                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(positions[1]);
                    arrList.remove(indexToRemove);
                    break;
                case "Insert":
                    arrList.add(Integer.parseInt(positions[2]),Integer.parseInt(positions[1]));
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(arrList);
    }
}
