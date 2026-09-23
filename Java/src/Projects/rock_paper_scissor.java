package Projects;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    static void main() {

        // ROCK PAPER SCISSORS GAME

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        // DECLARE VARIABLES
        String[] choices = {"rock", "paper", "scissors"};
        String playerchoice;
        String computerchoice;
        String playagain = "yes";

        do{
            // GET CHOICE FROM USER
            System.out.print("Enter a choice from (rock,paper,scissors): ");
            playerchoice = sc.nextLine().toLowerCase();


            if(!playerchoice.equals("rock") &&
                    !playerchoice.equals("paper") &&
                    !playerchoice.equals("scissors")){
                System.out.println("Invalid Choice!");
                continue;
            }

            computerchoice = choices[rd.nextInt(3)];
            System.out.println("Computer choice is: " + computerchoice);

            // CHECK WIN CONDITIONS

            if(playerchoice.equals(computerchoice)){
                System.out.println("It's a tie");
            }
            else if((playerchoice.equals("rock") && computerchoice.equals("scissors")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("rock")) ||
                    (playerchoice.equals("scissors") && computerchoice.equals("paper"))) {
                System.out.println("You win!");
            }
            else{
                System.out.println("You loose!");
            }

            System.out.print("Play again? ");
            playagain = sc.nextLine().toLowerCase();

        }while(playagain.equals("yes"));

        System.out.println("Thanks! for playing");
        sc.close();
    }
}
