package c02_objectsAndAPIs.ch07_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        String relativePath = "src/objectsAndAPIs_02/files/";

        File inputFile = new File(relativePath + "numbers.txt");
        File outputFile = new File(relativePath + "output.txt");

        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile);
                ){

            while(fileReader.hasNext()){
                fileWriter.println(fileReader.nextDouble());
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }
}
