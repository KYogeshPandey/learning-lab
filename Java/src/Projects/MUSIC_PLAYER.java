package Projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MUSIC_PLAYER {
    static void main(String[] args) {

        // How to play audio with Java (.wav, .au, .aiff)

        String filePath = "src/Projects/sigmamusicart-no-copyright-music-537751.wav";
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Restart");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                response = sc.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Format not supported");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("BYE!");
        }


    }
}
