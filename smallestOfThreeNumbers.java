public class smallestOfThreeNumbers {
    //write a method that prints the smallest out of 3 numbers

    public static void smallestNumber(int number1, int number2, int number3){
        if (number1 < number2 && number1 < number3){
            System.out.println(number1);
        }else if (number2 < number1&& number2 < number3){
            System.out.println(number2);
        }else{
            System.out.println(number3);
        }
    }
}
