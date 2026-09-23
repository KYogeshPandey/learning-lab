package Projects;

import java.util.Random;
import java.util.Scanner;

public class Slot_machine {
    static void main() {

        // JAVA SLOT MACHINE

        Scanner sc = new Scanner(System.in);

        // DECLARE VARIABLES
        double balance = 100;
        double bet;
        double payout;
        String[] row;
        String playAgain;

        // DISPLAY WELCOME MESSAGE
        System.out.println("**************************");
        System.out.println("  WELCOME TO JAVA SLOTS  ");
        System.out.println("Symbols: 💎 🎯 🔔 🍒 🏍️");
        System.out.println("**************************");

        // PLAY IF BALANCE > 0
        while(balance > 0){
            System.out.println("Your current balance is: $" + balance);

            // ENTER BET AMOUNT
            System.out.print("Enter your Bet amount: ");
            bet = sc.nextDouble();
            sc.nextLine();

            //    VERIFY IF BET < BALANCE
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            //    VERIFY IF BET > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }
            //    SUBTRACTING BET AMOUNT FROM BALANCE
            else{
                balance -= bet;
            }

            System.out.println("Spinning...");
            // SPIN ROW
            row = spinrow();
            // PRINT ROW
            printrow(row);
            // GET PAYOUT
            payout = getpayout(row,bet);

            if(payout > 0){
                System.out.println("You Won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("You lost the round");
            }

            // ASK TO PLAY AGAIN
            System.out.print("Do you want to play again? (Y/N) : ");
            playAgain = sc.next().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }

        // DISPLAY EXIT MESSAGE
        System.out.println("GAME OVER! Your final balance is $" + balance);
        sc.close();
    }
    static String[] spinrow(){

        Random rd = new Random();
        String[] symbols = {"💎", "🔔", "🎯", "🍒", "🏍️"};
        String[] row = new String[3];

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[rd.nextInt(symbols.length)];
        }
        return row;
    }
    static void printrow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static double getpayout(String[] row, double bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "💎" -> bet * 2;
                case "🔔" -> bet * 5;
                case "🎯" -> bet * 10;
                case "🍒" -> bet * 20;
                case "🏍️" -> bet * 100;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "💎" -> bet * 1.2;
                case "🔔" -> bet * 1.8;
                case "🎯" -> bet * 3;
                case "🍒" -> bet * 5;
                case "🏍️" -> bet * 12;
                default -> 0;
            };
        }
        else if(row[0].equals(row[2])){
            return switch(row[0]){
                case "💎" -> bet * 1.2;
                case "🔔" -> bet * 1.8;
                case "🎯" -> bet * 3;
                case "🍒" -> bet * 5;
                case "🏍️" -> bet * 12;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "💎" -> bet * 1.2;
                case "🔔" -> bet * 1.8;
                case "🎯" -> bet * 3;
                case "🍒" -> bet * 5;
                case "🏍️" -> bet * 12;
                default -> 0;
            };
        }

        return 0;
    }
}
