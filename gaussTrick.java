import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class gaussTrick {
    public static void main(String[] args) {
        //Write a program that sum all numbers in a list in the following order:
        //first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.

        Scanner scanner = new Scanner(System.in);
        List<Integer> arrList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean middleReached = false;
        boolean finished = false;
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = arrList.size() - 1 - i; j > 0; j++) {
                if (arrList.size() % 2 != 0) {
                    if (i == j) {
                        middleReached = true;
                        break;
                    }
                }
                if (i > j){
                    finished = true;
                    break;
                }
                System.out.print(arrList.get(i) + arrList.get(j) + " ");
                break;
            }
            if (middleReached) {
                System.out.print(arrList.get(i));
                break;
            }
            if (finished){
                break;
            }
        }
    }
}
