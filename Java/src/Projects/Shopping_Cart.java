import java.util.Scanner;

public class Shopping_Cart {
    public static void main(String[] args){

        // SHOPPING CART PROBLEM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for Each? ");
        price = scanner.nextDouble();

        System.out.print("How much do you want? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();



    }
}
