import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <= arrList.size()-1; i++) {
            if (arrList.get(i) < 0){
                arrList.remove(i);
                i -= 1;
            }
        }

        for (int i = arrList.size()-1; i >= 0 ; i--) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}
