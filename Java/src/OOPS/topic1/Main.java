package OOPS.topic1;

public class Main {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type


//        Car car = new Car();
//        System.out.println(Car.make);
//        System.out.println(Car.model);
//        System.out.println(Car.year);
//        System.out.println(Car.price);
//        System.out.println(Car.isRunning);

//        System.out.println(Car.isRunning);
//        Car.start();
//        System.out.println(Car.isRunning);
//        Car.stop();
//        System.out.println(Car.isRunning);
        Car car1 = Car.drive();
        Car car2 = Car.brake();

        System.out.println(car1.make + "-" + car1.model );
        System.out.println(car2.make + "-" + car2.model );

    }
}
