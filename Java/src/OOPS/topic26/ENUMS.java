package OOPS.topic26;

import java.util.Scanner;

public class ENUMS {
    public static void main(String[] args) {

        // Enums = (Enumerations) A special kind of class that
        //          represents a fixed set of constants.
        //          They improve code readability and are easy to Maintain.
        //          More efficient with switches when comparing Strings.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESSDAY,
                     THRUSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend");
            }

        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid Day");
        }



        sc.close();
    }
}
