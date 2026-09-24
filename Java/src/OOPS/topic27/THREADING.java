package OOPS.topic27;

import java.util.Scanner;

public class THREADING {
    public static void main(String[] args) {

        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations
        //             (File I/O, network communications, or any background tasks)

        // How to create a thread:
        // Option 1. Extend the thread class (simpler)
        // Option 2. Implement the runnable Interface (better)

        Scanner sc = new Scanner(System.in);

        System.out.println("You have 5 sec to enter your name");

        MyRunnable runa = new MyRunnable();
        Thread thread = new Thread(runa);
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name );
        sc.close();

    }
}
