package OOPS.topic4;

public class Main {
    static void main(String[] args) {

        Car[] cars = {new Car("bently", "black"),
                      new Car("porsche", "yellow"),
                      new Car("ferrari", "Red") };

        for (Car car : cars) {
            car.color = "black";
        }

        for (Car car : cars) {
            car.drive();
        }


    }
}
