package c03_ObjectOrientedProgramming.c3ch5_Abstraction.s3_InterfaceToProvideConformity;

import java.sql.Timestamp;

public class PasswordChangeEvent implements Event {

    private final long createdTimetamp;
    private final String id;

    public PasswordChangeEvent (String id) {
        this.id = id;
        this.createdTimetamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimetamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password. "
                +  "Sending a confirmation email to the customer.");
    }
}
