public class vowelsCount {
    //write a method that receives a single string and prints the count of the vowels.
    //a, e, i, o, u

    public static void printVowels(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (String.valueOf(text.charAt(i)).equalsIgnoreCase("a")){
                count++;
            }else if (String.valueOf(text.charAt(i)).equalsIgnoreCase("e")){
                count++;
            }else if (String.valueOf(text.charAt(i)).equalsIgnoreCase("i")){
                count++;
            }else if (String.valueOf(text.charAt(i)).equalsIgnoreCase("o")){
                count++;
            }else if (String.valueOf(text.charAt(i)).equalsIgnoreCase("u")){
                count++;
            }
        }
        System.out.println(count);
    }
}
