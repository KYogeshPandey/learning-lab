package Projects;

import java.util.Scanner;

public class Banking {

    static Scanner sc = new Scanner(System.in);

    public static void main() {

        double balance = 0;
        int choice;
        boolean isRunning = true;

        while(isRunning){

            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. CHECK BALANCE");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. EXIT");
            System.out.println("****************");

            // GET AND PROCESS USER CHOICE
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            System.out.println("****************");


            switch(choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }
        System.out.println("**************************");
        System.out.println("Thank You! Have a nice Day");
        System.out.println("**************************");

        sc.close();

    }
    static void showbalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = sc.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            System.out.printf("$%.2f is deposited\n", amount);
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = sc.nextDouble();
        if(amount < 0){
            System.out.println("Withdrawl amount can't be negative");
            return 0;
        }
        else if(amount > balance){
            System.out.println("Withdrawl amount can't be more than balance");
            return 0;
        }
        else{
            System.out.printf("You have successfully withdrawn $%.2f\n",amount);
            return amount;
        }

    }
}
