import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
//After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
//Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).
public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> arrList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < arrList.size(); i++) {
            i = 0;
            if (arrList.get(i) == (arrList.get(i+1))){
                int sum = arrList.get(i) + arrList.get(i+1);
                arrList.remove(i);
                arrList.remove(i);
                arrList.add(i,sum);

            }else{
                break;
            }
        }

        System.out.println(arrList);



    }
}
