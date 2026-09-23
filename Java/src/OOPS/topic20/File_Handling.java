package OOPS.topic20;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling {
    static void main(String[] args) throws IOException {

        // How to write a file using java (4 popular options)

        // FileWriter = Good for small or medium sized files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like report or logs
        // FileOutputStream = Best for binary Files (i.e; images, audio files)


        String filePath = "C:\\Users\\HP\\Desktop\\test.txt";
        String textContent = "I like Pizza !\nIt's really good!\nBuy me Pizza";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been Written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Something went Wrong");

        }

    }

}
