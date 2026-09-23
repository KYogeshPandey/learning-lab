package Practice;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter num1: ");
        int a = sc.nextInt();
        System.out.print("enter num2: ");
        int b = sc.nextInt();
        System.out.print("enter operation: ");
        char c = sc.next().charAt(0);
        int result;

        switch(c){
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            default:
                System.out.println("Invalid Operation");
                sc.close();
                return;
        }
        System.out.println(result);

        sc.close();
    }
}
