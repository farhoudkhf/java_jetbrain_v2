package c03_ObjectOrientedProgramming.c3ch5_Abstraction.s3_InterfaceToProvideConformity;

import java.sql.Timestamp;

public class MissedPaymentEvent implements Event {

    private String id;
    private long createdTimestamp;

    public MissedPaymentEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " missed their payment. "
                 + "Sending a bill to the customer.");
    }
}
