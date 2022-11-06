public class middleCharacters {
    //You will receive a single string.
    // Write a method that prints the middle character.
    // If the length of the string is even, there are two middle characters.
    // a d f g h j

    public static void middle(String input) {

        if (input.length() % 2 != 0) {
            System.out.println(input.charAt(input.length() / 2));
        } else {
            int split = input.length() / 2;
            System.out.print(input.charAt(split-1));
            System.out.println(input.charAt(split));
        }
    }
}
