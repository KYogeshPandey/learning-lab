package Practice;

import java.util.Scanner;

public class CI_Calculation {
    public static void main(String[] args){

        //Compound Interest Calculator

        Scanner sc = new Scanner(System.in);

        double Amount;
        double P;
        int n;
        int timesCompounded;
        double rate;

        System.out.print("Enter the Principal amount: " );
        P = sc.nextDouble();

        System.out.print("At what interest rate (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the # of times Compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the number of years: ");
        n = sc.nextInt();

        Amount = P * Math.pow(1 + rate/timesCompounded, timesCompounded * n);


        System.out.printf("The amount after %d years interest is %.2f",n , Amount);



        sc.close();

    }
}
