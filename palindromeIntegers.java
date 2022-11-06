public class palindromeIntegers {
    //write a method that returns true if a number is palindrome and false if its not
    public static void IsPalindrome(int number){
        int r;
        int sum = 0;
        int temp;

        temp = number;

        while (number > 0){
            r = number % 10;
            sum = (sum*10)+r;
            number /= 10;
        }
        if (temp == sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
