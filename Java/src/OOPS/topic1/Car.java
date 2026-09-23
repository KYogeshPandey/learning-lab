package OOPS.topic1;

public class Car {

    static String make = "Ford";
    static String model = "Mustang";
    static int year = 2025;
    static double price = 100000;
    static boolean isRunning = false;

    static void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    static void stop(){
        isRunning = false;
        System.out.println("you stop the engine");
    }
    static Car drive(){
//        System.out.println("You drive the "+ model);
        return null;
    }
    static Car brake(){
//        System.out.println("You brake the "+ model);
        return null;
    }


}
