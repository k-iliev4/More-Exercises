import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class treasureHunt {

//    The pirates must safely carry a treasure chest back to the ship, looting along the way.
//    Create a program that manages the state of the treasure chest along the way. On the first line, you will receive the initial loot of the treasure chest, a string of items separated by a "|".
//            "{loot1}|{loot2}|{loot3} … {lootn}"
//    The following lines represent commands until "Yohoho!" which ends the treasure hunt:
//            • "Loot {item1} {item2}…{itemn}":
//            ◦ Pick up treasure loot along the way. Insert the items at the beginning of the chest.
//        ◦ If an item is already contained, don't insert it.
//            • "Drop {index}":
//            ◦ Remove the loot at the given position and add it to the end of the treasure chest.
//        ◦ If the index is invalid, skip the command.
//    • "Steal {count}":
//            ◦ Someone steals the last count loot items. If there are fewer items than the given count, remove as many as there are.
//            ◦ Print the stolen items separated by ", ":
//            "{item1}, {item2}, {item3} … {itemn}"
//    In the end, output the average treasure gain, which is the sum of all treasure items length divided by the count of all items inside the chest formatted to the second decimal point:
//            "Average treasure gain: {averageGain} pirate credits."
//    If the chest is empty, print the following message:
//            "Failed treasure hunt."
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialInput = scanner.nextLine();
        String[] strarray = initialInput.split("\\|");

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(strarray));

        String input = scanner.nextLine();
        strarray = input.split(" ");
        while(!strarray[0].equals("Yohoho!")){

            if (strarray[0].equals("Loot")){

                for (int i = 1; i < strarray.length; i++) {
                    boolean alreadyExisting = false;
                    for (int j = 0; j < arrayList.size(); j++) {
                        if (strarray[i].equals(arrayList.get(j))){
                            alreadyExisting = true;
                            break;
                        }
                    }
                    if (!alreadyExisting){
                        arrayList.add(0,strarray[i]);
                    }
                }

            }

            if (strarray[0].equals("Drop")){
                String temp = arrayList.get(Integer.parseInt(strarray[1]));
                arrayList.remove(Integer.parseInt(strarray[1]));
                arrayList.add(arrayList.size(),temp);
            }

            if (strarray[0].equals("Steal")){
                int stealCount = Integer.parseInt(strarray[1]);

                if (arrayList.size()>= stealCount){
                    System.out.print("Stolen: ");
                    for (int i = 0; i < stealCount; i++) {
                        String last = arrayList.get(arrayList.size() - 1);
                        System.out.print(last + " ");
                        arrayList.remove(last);
                    }
                    System.out.println();
                }else{
                    arrayList.clear();
                }
            }

            input = scanner.nextLine();
            strarray = input.split(" ");
        }
        double treasureSum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            treasureSum+= arrayList.get(i).length();
        }
        treasureSum = treasureSum / arrayList.size();

        if (arrayList.size() <= 0){
            System.out.println("Failed treasure hunt.");
        }else{
            System.out.printf("Average treasure gain: %.2f pirate credits.",treasureSum);
        }

    }
}
