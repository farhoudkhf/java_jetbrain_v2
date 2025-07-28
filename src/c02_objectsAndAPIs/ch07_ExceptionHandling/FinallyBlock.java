package c02_objectsAndAPIs.ch07_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {
        String relativePath = "src/objectsAndAPIs_02/files/numbers.txt";
        File file = new File(relativePath);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext() ) {
                System.out.println(fileReader.nextDouble());
            }

        } catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}
