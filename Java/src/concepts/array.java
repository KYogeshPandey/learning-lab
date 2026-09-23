package concepts;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main() {

        // Array = a collection of values of the same data type
        //          * think of it as a variable that can store more than 1 value.*

        // String[] fruits = {"Apple","Mango","Banana","Peach","Papaya"};
        // int numoffruit = fruits.length;
        // fruits[0] = "pineapple";
        // Arrays.sort(fruits);
        // Arrays.fill(fruits,"Pineapple");

        Scanner sc = new Scanner(System.in);


        String[] foods;
        int size;

        System.out.print("Enter the # of Foods u like: ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter the Food: ");
            foods[i] = sc.nextLine();
        }

        for(String food : foods){
            System.out.println(food);

        }

        sc.close();







    }
}
