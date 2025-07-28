package c02_objectsAndAPIs.ch07_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) {

        String relativePath = "src/objectsAndAPIs_02/files/numbers.txt";
        File file = new File(relativePath);
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext() ) {
                System.out.println(fileReader.nextDouble());
            }
        }
        catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        } catch (Exception e){
            //TODO: do something different
        }
//        /Users/farhoudkhoshnoud/Library/CloudStorage/OneDrive-Personal/Self Study/java/java_essentials_v2/src/objectsAndAPIs_02/files/numbers.txt

    }
}
