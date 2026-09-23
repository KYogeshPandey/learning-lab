package OOPS.topic6;

public class Inheritance {
    static void main() {
        // Inheritance = One class inherits the attributes and methods from another class
        //               child <- Parent <- GrandParent


        Dog dog = new Dog();
        Cat cat = new Cat();


        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        System.out.println(Plant.isAlive);

        Plant.photosynthesize();




    }
}
