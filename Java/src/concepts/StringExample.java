package concepts;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = sc.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("username is " + username);
            System.out.println("Domain is "+ domain);
        }
        else{
            System.out.println("Email is invalid");
        }


        sc.close();

    }
}
