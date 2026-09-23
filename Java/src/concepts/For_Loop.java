package concepts;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) throws InterruptedException {

        // for loop = executes some code for a certain amount of time

        Scanner sc = new Scanner(System.in);

        System.out.print("How many seconds to countdown for?: ");
        int start = sc.nextInt();

        for(int i = start; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy new Year!");

        sc.close();
    }
}
