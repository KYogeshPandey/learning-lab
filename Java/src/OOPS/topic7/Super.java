package OOPS.topic7;

public class Super {
    static void main(String[] args) {

        // Super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize Attributes

        Person person = new Person ("Yogesh", "Pandey");
        Student student = new Student("Rahul", "Sharma", 4.5);
        Employee employee = new Employee("Aman", "Pandey", 50000);

        person.showname();
        student.showname();
        employee.showSalary();

        student.showGpa();


    }
}
