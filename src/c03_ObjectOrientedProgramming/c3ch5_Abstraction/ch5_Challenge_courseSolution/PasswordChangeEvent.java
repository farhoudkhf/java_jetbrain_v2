package c03_ObjectOrientedProgramming.c3ch5_Abstraction.ch5_Challenge_courseSolution;

public class PasswordChangeEvent extends AbstractEvent {

    public PasswordChangeEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password. " +
                "Sending a confirmation email to the customer.");
    }
}
