package Practice;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the value of A: ");
//        a = sc.nextDouble();
//
//        System.out.print("Enter the value of B: ");
//        b = sc.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("length of c is " +  c);

//        double radius;
//        double circumference;
//        double volume;
//        double area;
//        String name = "Yogesh";
//        int age = 22;
//        char firstLetter = 'Y';
//        double height = 167;
//        boolean isEmployed = true;

//        System.out.print("Enter the radius: ");
//        radius = sc.nextDouble();
//
//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius,2);
//        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
//
//        System.out.printf("your name is %s\n", name);
//        System.out.printf("Your name starts with %c Letter\n", firstLetter);
//        System.out.printf("you are %d year's old\n", age);
//        System.out.printf("your height is %f inches\n", height);
//        System.out.printf("Employed in MNC: %b\n", isEmployed);
//
//        System.out.printf("%s is %d year's old\n",name ,  age);
//
//
//        System.out.printf("The circumference of the circle is %.1fcm\n" , circumference);
//        System.out.printf("The volume is %.1fcm³\n" , volume);
//        System.out.printf("The area is %.1fcm²\n" , area);

//        double price1 = 9000.99;
//        double price2 = 10000000.14;
//        double price3 = -150000.888;
//
//        System.out.printf("% .2f\n",price1);
//        System.out.printf("% .2f\n",price2);
//        System.out.printf("% .2f\n",price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);


        sc.close();


    }
}
