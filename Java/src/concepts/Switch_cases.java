package concepts;

import java.util.Scanner;

public class Switch_cases {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Day: ");

        // Enhanced Switches


        String Day = sc.nextLine();

        switch(Day){
            case "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" ->
                    System.out.println("It is a Weekday 😕");
            case "Saturday" , "Sunday" ->
                    System.out.println("It is a Weekend 😂");
            default ->
                    System.out.println(Day + " is not a Day.");


        }

        sc.close();
    }
}
