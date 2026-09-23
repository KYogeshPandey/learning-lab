package OOPS.topic16;

public class COMPOSITION {
    static void main(String[] args) {

        // Composition = Represents a "part of" relationship between objects.
        //               For example , an engine is part of a car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette", 2025, "VA");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();



    }
}
