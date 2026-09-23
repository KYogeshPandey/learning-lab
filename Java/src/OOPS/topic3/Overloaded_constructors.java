package OOPS.topic3;

public class Overloaded_constructors {
    static void main(String[] args) {
        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways

        User user1 = new User("Yogesh");
        User user2 = new User("aman", 22);
        User user3 = new User("Rahul",24, "rahul@.com");
        User user4 = new User();

        System.out.println(user4.Username);
        System.out.println(user4.age);
        System.out.println(user4.email);
    }
}
