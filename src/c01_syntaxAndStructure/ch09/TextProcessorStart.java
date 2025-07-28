package c01_syntaxAndStructure.ch09;

public class TextProcessorStart {

    public static void main(String[] args) {

        String text = "I Love Java";
        countWords("I love Java");
        reverseString(text);
        reverseString_2("stop");
    }

    private static void reverseString_2(String text) {

        for (int i = text.length() - 1; i >= 0; i--) {

            System.out.print(text.charAt(i));
        }
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {

        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("The text contains: %d words.", numberOfWords);
        System.out.println(message); //sout
        System.out.println();
        for(int i=0; i < numberOfWords;i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){

        String[] words = text.split(" ");
        int numberOfWords = words.length;
        for (int i = numberOfWords - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
