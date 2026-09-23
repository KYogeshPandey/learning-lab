package concepts;

import java.util.Scanner;

public class While_Loops {
    public static void main(String[] args){

        // While Loop = repeat same code forever
        //              While some condition remains true

        Scanner sc = new Scanner(System.in);

        String name = "";

        while(!name.equals("Q")){
            System.out.println("You are playing a game.");
            System.out.print("Enter Q to quit: ");
            name = sc.next().toUpperCase();
        }
        System.out.println("Game is Ended");

        sc.close();




    }
}
