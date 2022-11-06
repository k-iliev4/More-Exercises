public class passwordValidator {
    //Write a program that checks if a given password is valid. Password rules are:
    //    • 6 – 10 characters (inclusive);
    //    • Consists only of letters and digits;
    //    • Have at least 2 digits.
    //If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule, print a message:
    //    • "Password must be between 6 and 10 characters";
    //    • "Password must consist only of letters and digits";
    //    • "Password must have at least 2 digits".

    public static void validation(String password) {
        boolean charLength = false; // must be true to pass
        boolean lettersAndDigitsOnly = false; // must be true to pass
        boolean atLeastTwoDigits = false; // must be true to pass
        int numCounter = 0;
        String[] array = password.split("");
        if (array.length >= 6 && array.length <= 10) {
            charLength = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        for (int i = 0; i < array.length; i++) {

            int toASCII = password.charAt(i);

            if (toASCII >= 'a' && toASCII <= 'z' || toASCII >= 'A' && toASCII <= 'Z') {
                lettersAndDigitsOnly = true;
            } else if (toASCII >= '0' && toASCII <= '9') {
                lettersAndDigitsOnly = true;
                numCounter++;
                if (numCounter >= 2) {
                    atLeastTwoDigits = true;
                }
            } else {
                lettersAndDigitsOnly = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }
        if (!atLeastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (atLeastTwoDigits && lettersAndDigitsOnly && charLength) {
            System.out.println("Password is valid");
        }
    }
}
