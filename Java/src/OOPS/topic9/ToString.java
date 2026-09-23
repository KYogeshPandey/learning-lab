package OOPS.topic9;

public class ToString {
    static void main(String[] args) {

        // .toString = Method inherited from the object class.
        //              Used to return a String representation of an object.
        //              By default, it returns a hash code as a unique identifier.
        //              It can be overridden to provide meaningful details.

        Car car1 = new Car("BMW", "RED", "s", 2023);


        System.out.println(car1);




    }
}
