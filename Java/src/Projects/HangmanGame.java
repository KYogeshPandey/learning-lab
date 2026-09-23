package Projects;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String filePath = "src/Projects/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());

            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not found file");
        }
        catch(IOException e){
            System.out.println("Something went Wrong");
        }

        Random rd = new Random();

        String word = words.get(rd.nextInt(words.size()));

        Scanner sc = new Scanner(System.in);

        ArrayList<Character> wordstate = new ArrayList<>();
        int wrongguess = 0;

        for (int i = 0; i < word.length(); i++){
            wordstate.add('_');
        }

        System.out.println("***********************");
        System.out.println("Welcome to JAVA hangman");
        System.out.println("***********************");

        while (wrongguess < 6){

            System.out.println(getHangmanArt(wrongguess));

            System.out.print("Word: ");

            for (char c : wordstate){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a charachter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordstate.set(i, guess);
                    }
                }

                if(!wordstate.contains('_')){
                    System.out.println(getHangmanArt(wrongguess));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else{
                wrongguess++;
                System.out.println("Wrong guess!");
            }

        }

        if(wrongguess >= 6){
            System.out.println(getHangmanArt(wrongguess));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        sc.close();
    }

    static String getHangmanArt(int wrongguess){

        return switch(wrongguess){
            case 0 -> """
                      
                      
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |
                    
                      """;
            case 3 -> """
                       o
                      /|
                        
                      """;
            case 4 -> """
                       o
                      /|\\
                        
                      """;
            case 5 -> """
                       o
                      /|\\
                      /  
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\ 
                      """;
            default -> "";
        };


    }
}
