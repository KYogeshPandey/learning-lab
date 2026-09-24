package Projects.Alarm_Clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filepath = "Java/src/Projects/Alarm_Clock/sigmamusicart-no-copyright-music-537751.wav";



        // Java Alarm Clock

        while(alarmTime == null){
            try{
                System.out.print("Enter an alarm time (HH:mm:ss): ");
                String inputtime = sc.nextLine();

                alarmTime = LocalTime.parse(inputtime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch(DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:mm:ss");
            }
        }

        clock alarmclock = new clock(alarmTime, filepath, sc);
        Thread alarmthread = new Thread(alarmclock);
        alarmthread.start();




    }
}
