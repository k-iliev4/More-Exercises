import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String[] array1 = input1.split(" ");
        String input2 = scanner.nextLine();
        String[] array2 = input2.split(" ");

        boolean identical = false;
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {

            if (array1[i].equals(array2[i])){
                identical = true;
                int num = Integer.parseInt(array1[i]);
                sum+= num;
            }else{
                identical = false;
                System.out.println("Arrays are not identical. Found difference at "+ i + " index.");
                break;
            }
        }

        if (identical){
            System.out.println("Arrays are identical. Sum: "+sum);
        }



    }
}
