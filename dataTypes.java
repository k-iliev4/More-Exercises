import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        if (command.equals("int")){
            int number = Integer.parseInt(scanner.nextLine());
            number = number * 2;
            System.out.println(number);
        }else if (command.equals("real")){
            int number = Integer.parseInt(scanner.nextLine());
            double result = number * 1.5;
            System.out.printf("%.2f",result);
        }else if (command.equals("string")){
            String string2 = scanner.nextLine();
            System.out.println("$"+string2+"$");
        }




    }
}
