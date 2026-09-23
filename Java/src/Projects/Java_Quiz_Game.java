package Projects;

import java.util.Scanner;

public class Java_Quiz_Game {
    static void main() {

        // JAVA QUIZ GAME

        // Questions Array[]
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered as brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of Computer?",
                              "What was the first Programming language?"};

        // Options array[][]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve jobs", "2. Bill gates", "3. Alan turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. JAVA"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        // Declare variables
        String input;
        int guess = 0;
        boolean quit = false;

        Scanner sc = new Scanner(System.in);

        // Welcome Message
        System.out.println("**************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("**************************");

        // question(loop)

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            //  Options
            for(String option : options[i]){
                System.out.println(option);
            }

            while(true){
                System.out.print("Enter Your guess between(1-4) or Q to exit the game: ");
                input = sc.next();

                if(input.equalsIgnoreCase("q")){
                    System.out.println("Game Exited!");
                    quit = true;
                    break;
                }

                guess = Integer.parseInt(input);

                if(guess >= 1 && guess <= 4){
                    break;
                }
                System.out.println("INVALID OPTION! Please enter a number between 1 and 4 or Q");

            }
            if(quit){
                break;
            }

            //  Check our guess
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("**********");
                System.out.println("INCORRECT!");
                System.out.println("**********");
            }
        }
        // Display Final Score
        System.out.println("Your final score is " + score + " out of " + questions.length);

        sc.close();

    }
}
