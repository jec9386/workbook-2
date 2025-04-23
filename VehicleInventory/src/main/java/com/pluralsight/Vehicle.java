package com.pluralsight;

public class Vehicle {
    //no need for main not creating a method but objects

    //variable declarations or instance variables (also called fields).- store state(attribute) of the object.Represent the properties of that object.
    // These variables are used to store data that is associated with objects of the class.
    //I made them private so they can;t be accessd directly from outside the class. this term is called Encapsulation
    //defined inside a class outside any method or constructor. Belongs to the object- each object gets its own copy.
    //can be used anywhere insdie the class

    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    //constructor- responsible fore initializing an object. set initial state of an object of that class.
    // when new object of vehicle created. arguments in the paramenter are used to set the initial value of teh instance variable or field
    //this. is current instance of the object being created- refer the instance that comes after .

    //the parameter are values passed into constructor from a new object being created.
    //constructor initializing the instance variables with values that are passed when a new object is created. Set up object state.
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;

    }

    //get methods + set methods for each variable.
    //vehicleId
    public long getVehicleId (){
        return this.vehicleId;
    }
    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }

    //makeModel
    public String getMakeModel (){
        return this.makeModel;
    }
    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    //color
    public String getColor (){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //odometer reading
    public int getOdometerReading (){
        return this.odometerReading;
    }
    public void setOdometerReading(int odometerReading){
        this.odometerReading = odometerReading;
    }

    //price
    public float getPrice (){
        return this.price;
    }
    public void setPrice(float price){
        this.price = price;
    }




}
