public class charactersInRange {
    //Write a method that receives two characters and prints all the characters in between them on a single line according to ASCII.

    public static void printChars(char first, char second){

        if (first < second) {
            for (int i = Character.valueOf(first) + 1; i < Character.valueOf(second); i++) {
                System.out.println(Character.toString(i));
            }
        }else{
            for (int i = Character.valueOf(second) + 1; i < Character.valueOf(first); i++) {
                System.out.println(Character.toString(i));
            }
        }
    }
}
