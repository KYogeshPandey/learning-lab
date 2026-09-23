package OOPS.topic23;

import java.util.Timer;
import java.util.TimerTask;

public class TIMER {
    public static void main(String[] args) {

        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for : Sending notifications, scheduled updates, repetitve actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             create a subclass of TimerTask and @Override run()

         Timer timer = new Timer();
         TimerTask task = new TimerTask(){

             int count = 3;
             public void run() {
                 System.out.println("Hello!");
                 count--;
                 if(count <= 0){
                     System.out.println("TASK COMPLETE!");
                     timer.cancel();
                 }
             }
         };

         timer.schedule(task,0, 1000);


    }
}
