package Questions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){

        // Find largest among 3 numbers

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b + " is the largest number");
        }
        else{
            System.out.println(c + " is the largest number");
        }

        sc.close();
    }
}
