package c01_syntaxAndStructure.ch09;

// Java code below
/*********************************************************
 Write your answer here, and then test your code.
 Your job is to implement the validatePassword() method.
 **********************************************************/

public class Answer_09 {

    public static void main(String[] args) {
        //countWords("I love Java");
        validatePassword("stop &jane_doe");
    }

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Current credentials
    static String username = "jane_doe";
    static String currentPassword = "passw0rd";


    static boolean validatePassword(String newPassword) {


        /***************************************************
         * TODO: Your code goes here
         *
         * Criteria:
         *   at least 8 characters long
         *   contains an uppercase letter
         *   contains a special character
         *   does not contain the username
         *   is not the same as the old password
         */

//        boolean oldPasswordTest = true;
//        boolean lengthTest = true;
//        boolean containUsernameTest = true;
        boolean isValid = true;
        if (newPassword.equals(currentPassword)) {
            System.out.println("Can't be the same as previous password");
//            oldPasswordTest = false;
            isValid = false;
        }

        if (newPassword.length() < 8) {
            System.out.println("must be at least 8 characters long");
//            lengthTest = false;
            isValid = false;
        }

        if (newPassword.contains(username)) {
            System.out.println("password can't contain username.");
//            containUsernameTest = false;
            isValid = false;
        }



        int countUpperCase = 0;
        int countLowerCase = 0;
        int countSpecialChar = 0;
        for (int i = 0; i < newPassword.length(); i++) {

            if (Character.isUpperCase(newPassword.charAt(i))) {
                countUpperCase++;
            }
            if (Character.isLowerCase(newPassword.charAt(i))) {
                countLowerCase++;
            }
            if (!Character.isLetterOrDigit(newPassword.charAt(i))) {
                countSpecialChar++;
            }

        }

        String message = String.format("password contains %d upperCaseLetter, %d lowerCase and %d specialChar"
                , countUpperCase, countLowerCase, countSpecialChar);
        System.out.println(message);

        return (isValid && countUpperCase > 0 && countLowerCase > 0 && countSpecialChar > 0);
    }

}



