import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();



        for (int i = number.length()-1; i >=0 ; i--) {
            if (number.charAt(i) == 49){
                System.out.println("one");
                break;
            }
            if (number.charAt(i) == 50){
                System.out.println("two");
                break;
            }
            if (number.charAt(i) == 51){
                System.out.println("three");
                break;
            }
            if (number.charAt(i) == 52){
                System.out.println("four");
                break;
            }
            if (number.charAt(i) == 53){
                System.out.println("five");
                break;
            }
            if (number.charAt(i) == 54){
                System.out.println("six");
                break;
            }
            if (number.charAt(i) == 55){
                System.out.println("seven");
                break;
            }
            if (number.charAt(i) == 56){
                System.out.println("eight");
                break;
            }
            if (number.charAt(i) == 57){
                System.out.println("nine");
                break;
            }

        }
    }
}
