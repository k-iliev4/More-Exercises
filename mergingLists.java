import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You are going to receive two lists with numbers.
        // Create a result list that contains the numbers from both of the lists.
        // The first element should be from the first list, the second from the second list, and so on.
        // If the length of the two lists is not equal, just add the remaining elements at the end of the list.

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<Integer>();
        int position = 0;

        while (list1.size() > 0 && list2.size() > 0){
            result.add(list1.get(0));
            result.add(list2.get(0));
            list1.remove(0);
            list2.remove(0);
            position++;
        }
        if (list1.size() > 0){
            for (int i = 0; i < list1.size(); i++) {
                result.add(list1.get(i));
            }
        }
        if (list2.size() > 0){
            for (int i = 0; i < list2.size(); i++) {
                result.add(list2.get(i));
            }
        }
        System.out.println(result);
    }
}
