package Practice;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i=0; i<=n; i++){
            if (i == 0){
                System.out.println(a);
            }
            else if(i == 1){
                System.out.println(b);
            }
            else{
                sum = a+b;
                System.out.println(sum);

                a = b;
                b = sum;



            }
        }


        sc.close();
    }
}
