package OOPS.topic13;

import java.util.Scanner;

public class Runtime_Polymorphism {
    static void main(String[] args) {

        // Runtime_Polymorphism(Dynamic Polymorphism) = When the methods that gets executed is decided
        //                                              at runtime based on the actual type of the object.

        Scanner sc = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or cat? : (1- Dog | 2- Cat): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }


        sc.close();

    }
}
