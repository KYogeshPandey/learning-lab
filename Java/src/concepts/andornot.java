package concepts;

import java.util.Scanner;

public class andornot {
    public static void main(String[] args){


        // Logical Operators

        // && = AND
        // || = OR
        // ! = NOT
        Scanner sc = new Scanner(System.in);

        String username;


        System.out.print("Enter your username: ");
        username = sc.nextLine();

        if(username.length() < 4 && username.length() > 12){
            System.out.println("Username should be between 4-12 Characters.");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username should not cantain spaces and underscores.");
        }
        else{
            System.out.println("Welcome " + username);
        }

        sc.close();


    }
}
