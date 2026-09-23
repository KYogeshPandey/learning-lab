package Questions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){

        // Check whether number is even or odd

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even.");
        }
        else{
            System.out.println(num + " is Odd");
        }

        sc.close();



    }




}
