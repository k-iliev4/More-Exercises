public class multiplicationSequence {
    //You are given a number num1, num2, and num3. Write a program that finds if num1 * num2 * num3
    // (the product) is negative, positive, or zero.
    // Try to do this WITHOUT multiplying the 3 numbers.
    public static void sequence (int num1, int num2, int num3){
        if (num1 == 0 || num2 == 0 || num3 == 0){
            System.out.println("zero");
        }else if (num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }
    }
}
