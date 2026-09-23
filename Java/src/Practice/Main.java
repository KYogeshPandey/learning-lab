package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Calculate the area of a rectangle

        double width = 0;
        double height = 0;
        double area;
        double breadth = 0;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        System.out.print("Enter the breadth: ");
        breadth = scanner.nextDouble();

        area = width * height;
        volume = width * height * breadth;

        System.out.println("The area is " + area + "cm²");
        System.out.println("The volume is " + volume + "cm^3");

        scanner.close();
    }
}
