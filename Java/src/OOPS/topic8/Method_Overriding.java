package OOPS.topic8;

public class Method_Overriding {
    static void main(String[] args) {

        // Mathod Overriding = When a subclass provides its own implementation of a method that is alreasy defined.
        //                      Allows for code reusabilty and give specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();



    }
}
