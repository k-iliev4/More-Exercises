public class signOfInteger {
    //Create a method that prints the sign of an integer number.

    public static void sign(int n){
        if (n == 0 ){
            System.out.println("The number "+n+" is zero.");
        }else if (n > 0){
            System.out.println("The number "+n+" is positive.");
        }else{
            System.out.println("The number "+n+" is negative.");
        }
    }
}
