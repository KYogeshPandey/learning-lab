package OOPS.topic28;

public class Multi_Threading {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = a set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations.

        // Option 1. Extend thread class
        // Option 2. Implement Runnable Interface


        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG "));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was Interrupted");
        }


        System.out.println("GAME OVER!");

    }
}
