package Practice;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Enter # of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter # of columns: ");
        columns = sc.nextInt();

        sc.close();


        for(int i = 0; i < rows; i++){
            for(int k=0; k < columns; k++){
                if (k < columns-i-1){
                    System.out.print("-");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();

        }
    }
}
