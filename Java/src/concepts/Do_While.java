package concepts;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 5;

        do{
            System.out.print("Enter the number between 1-10: ");
            num = sc.nextInt();
        }while(num < 1 || num > 10);

        System.out.printf("you have picked the number %d ", num);

        sc.close();


    }
}
