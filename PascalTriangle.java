import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {

            for (int j = 1; j < rotations - i; j++) {
                System.out.print(" ");
            }

            int number = 1;

            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
