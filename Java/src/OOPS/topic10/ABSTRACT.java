package OOPS.topic10;

public class ABSTRACT {
    static void main(String[] args) {

        //abstract = Used to define abstract classes and methods.
        //           Abstraction is the process of hiding implementation and details and showing only the essential features.
        //           Abstract class can't be initiated directly.
        //           Can contain 'abstract' methods (which must be implemented).
        //           Can contain 'concrete' methods (which are inherited).

        circle circle = new circle(3);
        triangle triange = new triangle(4,5);
        rectangle rectangle = new rectangle(6,7);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triange.area());

    }
}
