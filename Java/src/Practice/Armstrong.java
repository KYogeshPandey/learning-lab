package Practice;

import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int num = sc.nextInt();
        int original = num;
        double result = 0;

        while(num>0){
            result = result + (num%10)*(num%10)*(num%10);
            num = num/10;
        }
        System.out.println(result);
        if (result == original){
            System.out.println("number is Practice.Armstrong");
        }
        else{
            System.out.println("number is not Practice.Armstrong");
        }

        sc.close();

    }
}
