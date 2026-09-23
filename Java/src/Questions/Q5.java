package Questions;

import java.util.Scanner;

public class Q5 {
    static void main() {
        // Find sum of digits

        Scanner sc = new Scanner(System.in);

        int num;
        int rem;
        int sum = 0;

        System.out.print("Enter the number: ");
        num = sc.nextInt();

        while(num>0){
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.println(sum);

        sc.close();

    }
}
