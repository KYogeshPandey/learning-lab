package OOPS.topic2;

public class Constructors {
    static void main() {

        // constructor = A special method to initialize objects
        //               You can pass arguments to a condtructor
        //               and set up initial values

        Student student1 = new Student("Yogesh", 22, 7.5);
        Student student2 = new Student("Aman", 23, 8);

        student1.study();
        student2.study();

    }
}
