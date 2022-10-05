import java.util.Scanner;

public class CommonElements {
    //compares and prints common elements from the second array to the first one
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String[] array1 = input1.split(" ");
        String input2 = scanner.nextLine();
        String[] array2 = input2.split(" ");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].equals(array1[j])){
                    System.out.print(array2[i]+ " ");
                }
            }
        }

    }
}
