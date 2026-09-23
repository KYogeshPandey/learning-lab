package OOPS.topic4;

public class Car {

    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("you are driving the " + this.color + " " + this.model);
    }
}
