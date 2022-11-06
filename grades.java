public class grades {
    public static void gradeInWords(double n){
        if (n <= 2.99){
            System.out.println("Fail");
        }else if (n <= 3.49){
            System.out.println("Poor");
        }else if (n <= 4.49){
            System.out.println("Good");
        }else if (n <=5.49){
            System.out.println("Very Good");
        }else{
            System.out.println("Excellent");
        }
    }
}
