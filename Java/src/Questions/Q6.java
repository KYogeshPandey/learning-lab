package Questions;

import java.util.Scanner;

public class Q6 {
    // Check Practice.palindrome number

    static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        int rem;
        int new_num = 0;
        int original = num;


        while(num > 0){

            rem = num % 10;
            new_num = new_num * 10 + rem;
            num = num / 10;
        }

        if(new_num == original){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        sc.close();

    }
}
