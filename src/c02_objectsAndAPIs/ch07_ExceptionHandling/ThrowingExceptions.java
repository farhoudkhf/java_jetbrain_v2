package c02_objectsAndAPIs.ch07_ExceptionHandling;

public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate) throws NegativeInputException {
        if (hours > 40) {
            throw new IllegalArgumentException("Hours must me less than or equal 40.");
        }
        if (hours < 0 || payRate < 0) {
            throw new NegativeInputException();
        }
        return hours * payRate;
    }
}
