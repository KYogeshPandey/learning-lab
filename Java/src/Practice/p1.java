package Practice;// import java.sql.SQLOutput;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int sum;
        int num;
        String name;

        System.out.print("Enter a num: ");
        num = sc.nextInt();

        sc.nextLine();

        System.out.print("enter your name: ");
        name = sc.nextLine();

        System.out.print("enter a num: ");
        num1 = sc.nextInt();

        System.out.print("enter second num: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println(num1 + name + num2);
        System.out.println("hello" + (5+5));

        while(num>0){
            System.out.println(num%10);
            num = num/10;
        }

        sc.close();


    }
}
