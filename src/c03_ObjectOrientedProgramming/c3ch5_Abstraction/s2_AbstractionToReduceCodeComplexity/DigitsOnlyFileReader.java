package c03_ObjectOrientedProgramming.c3ch5_Abstraction.s2_AbstractionToReduceCodeComplexity;

public class DigitsOnlyFileReader extends AbstractFileReader {

    public DigitsOnlyFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String parseLine(String line) {
        return line.replaceAll("[^0-9]", "");
    }
}
