package com.pluralsight;


// --- creating a class named CellPhone
public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // --- creating paramaterless constructor
    // --- setting default values
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public void dial(String phoneNumber){
        System.out.printf("%s's Cell phone is dialing the number %s from the number %s \n"
        , this.owner
        , phoneNumber
        , this.getPhoneNumber());
    }

    // ---
    public double getSerialNumber(){
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getModel(){
       return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getCarrier(){
        return this.carrier;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getPhoneNumber(){
        return this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

}
