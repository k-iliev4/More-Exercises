import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        //n being the count of wagons of a train, array
        //consists of count of people being in the train, at the end prints array(people and their total sum)
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum+=num;
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
