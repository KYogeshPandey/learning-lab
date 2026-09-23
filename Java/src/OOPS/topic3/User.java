package OOPS.topic3;

public class User {
    String Username;
    String email;
    int age;


    User(){
        this.Username = "No buddy";
        this.email = "not provided";
        this.age = 0;
    }
    User(String Username){
        this.Username = Username;
        this.email = "not provided";
        this.age = 0;
    }
    User(String Username, int age){
        this.Username = Username;
        this.email = "not provided";
        this.age = age;
    }
    User(String Username, int age, String email){
        this.Username = Username;
        this.email = email;
        this.age = age;
    }


}
