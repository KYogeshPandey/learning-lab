package Projects;

import java.util.Random;
import java.util.Scanner;

public class Guess_num {
    public static void main(String[] args){

        // Number guessing game

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int guess;
        int attempts = 0;
        int min;
        int max;

        System.out.print("Enter the minimum number of range: ");
        min = sc.nextInt();
        System.out.print("Enter the maximum number of range: ");
        max = sc.nextInt();

        int random_num = rd.nextInt(min, max+1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n",min ,max);


        do{
            System.out.printf("Enter a number guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess > random_num){
                System.out.println("Too High! Try again");
            }
            else if(guess < random_num){
                System.out.println("Too low! Try again");
            }
            else{
                System.out.println("Correct! The number was " + random_num);
                System.out.println("# of attempts " + attempts);
            }

        }while(guess != random_num);

        System.out.println("Hurrah! You won the Game");


        sc.close();
    }
}
