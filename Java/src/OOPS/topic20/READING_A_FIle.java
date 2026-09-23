package OOPS.topic20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class READING_A_FIle {
    static void main(String[] args) {

        // How to read a file using Java (3 Popular methods)

        // BufferedReader + FileReader : Best for Reading text files line by line.
        // FileInputStream : Best for Binary files (eg - images, audio files)
        // RandomAccessFile : Best for read/write specific portion of a large file.

        String filePath = "C:\\Users\\HP\\Desktop\\test.txt";



        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String Line;
            while((Line = reader.readLine()) != null){
                System.out.println(Line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("something went wrong!");
        }

    }
}
