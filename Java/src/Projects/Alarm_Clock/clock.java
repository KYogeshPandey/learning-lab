package Projects.Alarm_Clock;

import javax.sound.sampled.*;
import javax.tools.Tool;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class clock implements Runnable{

    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner sc;

    clock(LocalTime alarmTime, String filepath, Scanner sc){

        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.sc = sc;
    }

    @Override
    public void run(){

        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", now.getHour(),
                                                      now.getMinute(),
                                                      now.getSecond());
            }
            catch(InterruptedException e){
                System.out.println("Thread is Interrupted");
            }

        }

        System.out.println("\n*ALARM NOISES*");
        playsound(filepath);

    }

    private void playsound(String filepath){
         File audiofile = new File(filepath);

        try(AudioInputStream audiostream = AudioSystem.getAudioInputStream(audiofile);){
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();

            System.out.print("Press *Enter* to stop the alarm: ");
            sc.nextLine();
            clip.stop();

            sc.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file format is not supported");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
    }

}
