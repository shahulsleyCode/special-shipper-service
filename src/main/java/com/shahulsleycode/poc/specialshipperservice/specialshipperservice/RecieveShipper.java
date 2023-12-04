package com.shahulsleycode.poc.specialshipperservice.specialshipperservice;


public class RecieveShipper {

    private String shipperNumber;
    private String insertTimeStamp;
    private String loginId;
    private int   retentionPeriod;

    public RecieveShipper(String shipperNumber, String insertTimeStamp, String loginId, int retentionPeriod ) {
        this.shipperNumber   = shipperNumber;
        this.insertTimeStamp = insertTimeStamp;
        this.loginId         = loginId;
        this.retentionPeriod = retentionPeriod;
    }

    public String getShipperNumber() {
        return shipperNumber;
    }

    public String getInsertTimeStamp() {
        return insertTimeStamp;
    }

    public String getLoginId() {
        return loginId;
    }

    public int getRetentionPeriod() {
        return retentionPeriod;
    }

    @Override
    public String toString() {
        return "RecieveShipper [shipperNumber=" + shipperNumber 
                + ", insertTimeStamp=" + insertTimeStamp
                + ", loginId=" + loginId 
                + ", retentionPeriod=" + retentionPeriod + "]";
    }
    
}
