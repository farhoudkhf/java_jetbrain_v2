package c02_objectsAndAPIs.ch07_ExceptionHandling;

// Java code below
/***************************************************
 Write your answer here, and then test your code.
 Your job is to implement the checkAccess() method.
 ****************************************************/

import java.util.List;

class Answer02_ch07 {

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static List<String> authorizedUsers = List.of("techwizard87", "codeNinja123", "dataQueen99", "cyberPioneer", "byteMaster", "algorithmGuru", "cloudSurfer55", "pixelPilot", "javaJedi", "scriptScribe");
    static String accessDeniedMessage = "Access denied";


    static void checkAccess(String username) throws UnauthorizedException {
        /*******************************************************
         TODO: Your code goes here.

         Implement this method to throw an UnauthorizedException
         if the provided username is not in the authorizedUsers
         list. Use accessDeniedMessage as the exception's message
         ********************************************************/

//        boolean containsUsername = authorizedUsers.contains(username);

        if (! authorizedUsers.contains(username)) {
            throw new UnauthorizedException(accessDeniedMessage);
//            System.out.println("not authorized");
        }
    }
}

// Do not change this class
class UnauthorizedException extends Exception {
    public UnauthorizedException(){
        this ("Unauthorized to access");
    }
    public UnauthorizedException(String message){
        super(message);
    }

    public static void main(String[] args) throws UnauthorizedException {
        /*************************************************************
         This is how your code will be called.
         Your code should throw an exception if the username is not
         in the authorizedUsers list.
         You can edit this code to try different testing cases.
         *************************************************************/
        String username = "angie";
        Answer02_ch07.checkAccess(username);
    }
}

