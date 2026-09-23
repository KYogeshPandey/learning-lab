package Questions;

import java.util.Scanner;

public class Q4 {
    static void main() {

        // Count digits in a number

        Scanner sc = new Scanner(System.in);

        int num;
        int count = 0;

        System.out.print("Enter the number: ");
        num = sc.nextInt();

        while(num > 0){
            num = num / 10;
            count++;
        }

        System.out.println(count);


        sc.close();
    }

}
