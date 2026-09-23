package OOPS.topic18;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the  # of food you would like: ");
        int numofFood = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= numofFood; i++){
            System.out.print("Enter food # " + i + ": ");
            String food = sc.nextLine();
            foods.add(food);
        }

        sc.close();

    }
}
