package OOPS.topic9;

public class Car {

    String make;
    String color;
    String model;
    int year;

    Car(String model, String color, String make, int year){

        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;

    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.year;
    }



}
