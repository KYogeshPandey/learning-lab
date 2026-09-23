
import java.util.Scanner;

public class Weight_conversion {
    public static void main(String[] args){

        // Weight Conversion Program

        Scanner sc = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println("option 1 converts kg into lbs");
        System.out.println("option 2 converts lbs in kg");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in kg: ");
            weight = sc.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("the weight in lbs is %.2f", newweight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("the weight in kg is %.2f", newweight);
        }
        else{
            System.out.println("That was not a valid choice");
        }

        sc.close();

    }
}
