package OOPS.topic5;

public class Static_keyword {
    static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.



        Friend friend1 = new Friend("Yogesh");
        Friend friend2 = new Friend("Aman");
        Friend friend3 = new Friend("Rahul");

        System.out.println(friend1.name);
        System.out.println(Friend.numoffriends);

        Friend.showfriends();
        Math.round(3.99);

    }
}
