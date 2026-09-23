package OOPS.topic12;

public class POLYMORPHISM {
    static void main(String[] args) {

        // POLYMORPHISM  =   "POLY" = "MANY"
        //                   "MORPH" = "shape"
        //                   objects can identify as other objects/
        //                   Objects can be treated as objects of a class superclass


        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike , boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
