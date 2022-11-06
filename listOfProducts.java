import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read a number n and n lines of products. Print a numbered list of all the products ordered by name.

        int rotations = Integer.parseInt(scanner.nextLine());

        ArrayList<String> arrlist = new ArrayList<>();

        for (int i = 0; i < rotations; i++) {
            String product = scanner.nextLine();
            arrlist.add(product);

        }
        Collections.sort(arrlist);
        System.out.println(arrlist);


    }
}
