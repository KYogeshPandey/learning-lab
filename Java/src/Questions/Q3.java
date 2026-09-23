package Questions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){

        // Reverse a number

        Scanner sc = new Scanner(System.in);

        int num;
        int rev = 0;
        int rem;

        System.out.print("Enter the number: ");
        num = sc.nextInt();

        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println(rev);


        sc.close();

    }
}
