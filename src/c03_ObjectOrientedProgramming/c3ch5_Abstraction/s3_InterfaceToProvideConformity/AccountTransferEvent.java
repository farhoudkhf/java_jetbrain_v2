package c03_ObjectOrientedProgramming.c3ch5_Abstraction.s3_InterfaceToProvideConformity;

import java.sql.Timestamp;

public class AccountTransferEvent implements Event {

    private String id;
    private Long createdTimestamp;

    public AccountTransferEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer " +
                "their service. Reaching out to CTE to remove " +
                "service form old device and add service to " +
                "new device");
    }
}
