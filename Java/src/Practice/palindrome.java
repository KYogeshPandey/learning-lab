package Practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        int original = a;
        int num = 0;

        while(a>0){
            num=num*10+a%10;
            a = a/10;
        }
        if (num == original){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}
