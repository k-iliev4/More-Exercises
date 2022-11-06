public class topInteger {
    //Find all top integer in the range [1 … n] and print them.
    //A top integer holds the following properties:
    //• Its sum of digits is divisible by 8, e.g. 8, 16, 88.
    //• Holds at least one odd digit, e.g. 232, 707, 87578.
    public static void isTopInteger(int n){
        boolean divisible = false; //must be true
        boolean oneOddDigit = false; //must be true


        for (int i = 1; i <= n; i++) {
            String temp = String.valueOf(i);
            String[] array = temp.split("");
            divisible = false;
            oneOddDigit = false;
            int sum = 0;

            for (int k = 0; k < array.length; k++) {
                sum += Integer.parseInt(array[k]);
            }
            for (int j = 0; j < array.length; j++) {

                if (sum % 8 == 0){
                    divisible = true;
                }
                if (Integer.parseInt(array[j]) != 1 && Integer.parseInt(array[j]) % 2 != 0){
                    oneOddDigit = true;
                }
            }
            if (divisible && oneOddDigit){
                System.out.println(i);
            }

        }

    }
}
