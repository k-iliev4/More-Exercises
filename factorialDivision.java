public class factorialDivision {
    //Read two integer numbers.
    //Calculate the factorial of the first number.
    //Divide the first result by the second and print the division formatted to the second decimal point.
    // 5! = 5 x 4 x 3 x 2 x 1 = 120

    public static void factorial(int factorialNum, int divider){

        double factorialSum = 1;
        for (int i = factorialNum; i > 0 ; i--) {
            factorialSum *= i;
        }
        System.out.printf("%.2f",factorialSum / divider);
    }
}
