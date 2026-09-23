package OOPS.topic21;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {

        // How to work with dates and times using Java
        // (Localdate, Localtime, LocalDateTime, UTC timestamp)

        // Custom Format

//        LocalDateTime datetime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//
//        String newDateTime = datetime.format(formatter);
//
//        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2024, 1, 1, 0, 0, 0);


        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if (date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if (date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }



    }
}
