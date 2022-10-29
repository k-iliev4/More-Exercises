import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {

        //Now we will implement more complicated list commands.
        // Again, read a list, and until you receive "end" read commands:
        //Contains {number} – check if the list contains the number.
        // If yes, print "Yes", otherwise, print "No such number"
        //Print even – print all the numbers that are even separated by a space
        //Print odd – print all the numbers that are oddly separated by a space
        //Get sum – print the sum of all the numbers
        //Filter {condition} {number} – print all the numbers that fulfill that condition.
        //The condition will be either '<', '>', ">=", "<="
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] arrCommand = command.split(" ");
            if (arrCommand[0].equals("Contains")){
                int numberToContain = Integer.parseInt(arrCommand[1]);
                boolean Contains = false;
                for (int i = 0; i < arrList.size(); i++) {
                    if (arrList.get(i) == numberToContain){
                        Contains = true;
                    }
                }
                if (Contains){
                    System.out.println("Yes");
                }else{
                    System.out.println("No such number");
                }
            }
            if (command.equals("Print even")){
                for (int i = 0; i < arrList.size(); i++) {
                    if (arrList.get(i) % 2 == 0 && arrList.get(i) != 1){
                        System.out.print(arrList.get(i) + " ");
                    }
                }
                System.out.println();
            }
            if (command.equals("Print odd")){
                for (int i = 0; i < arrList.size(); i++) {
                    if (arrList.get(i) % 2 != 0 && arrList.get(i) != 2){
                        System.out.print(arrList.get(i) + " ");
                    }
                }
                System.out.println();
            }
            if (command.equals("Get sum")){
                int sum = 0;
                for (int i = 0; i < arrList.size(); i++) {
                    sum += arrList.get(i);
                }
                System.out.println(sum);
            }
            if (arrCommand[0].equals("Filter")){
                if (arrCommand[1].equals("<")){
                    for (int i = 0; i < arrList.size(); i++) {
                        if (arrList.get(i) < Integer.parseInt(arrCommand[2])){
                            System.out.print(arrList.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
                if (arrCommand[1].equals(">")){
                    for (int i = 0; i < arrList.size(); i++) {
                        if (arrList.get(i) > Integer.parseInt(arrCommand[2])){
                            System.out.print(arrList.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
                if (arrCommand[1].equals(">=")){
                    for (int i = 0; i < arrList.size(); i++) {
                        if (arrList.get(i) >= Integer.parseInt(arrCommand[2])){
                            System.out.print(arrList.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
                if (arrCommand[1].equals("<=")){
                    for (int i = 0; i < arrList.size(); i++) {
                        if (arrList.get(i) <= Integer.parseInt(arrCommand[2])){
                            System.out.print(arrList.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }


            command = scanner.nextLine();
        }


    }
}
