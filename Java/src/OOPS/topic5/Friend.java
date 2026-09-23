package OOPS.topic5;

public class Friend {

    static int numoffriends;
    String name;

    Friend(String name){
        this.name = name;
        numoffriends++;
    }

    static void showfriends(){
        System.out.println("You have " + numoffriends + " total friends");
    }


}
