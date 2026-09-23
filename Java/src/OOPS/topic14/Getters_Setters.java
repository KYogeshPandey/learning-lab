package OOPS.topic14;

import OOPS.topic13.Animal;

public class Getters_Setters {
    static void main(String[] args) {

        // They help protect object data and add rules for accessing and modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(-100);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
