package c03_ObjectOrientedProgramming.c3ch5_Abstraction.ch5_Challenge_courseSolution;

public class AccountTransferEvent extends AbstractEvent {

    public AccountTransferEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer " +
                "their service. Reaching out to CTE to remove " +
                "service form old device and add service to " +
                "new device");
    }
}
