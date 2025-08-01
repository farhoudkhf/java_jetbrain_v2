package c03_ObjectOrientedProgramming.c3ch5_Abstraction.s2_AbstractionToReduceCodeComplexity;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String relativePath = "src/c03_ObjectOrientedProgramming/c3ch5_Abstraction/s2_AbstractionToReduceCodeComplexity/";

        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader(relativePath + "message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());
    }
}
