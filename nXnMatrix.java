public class nXnMatrix {
    //Write a method that receives a single integer n and prints an nxn matrix with that number.

    public static void matrix (int number){

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
