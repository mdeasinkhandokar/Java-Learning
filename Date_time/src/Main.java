import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args){



        ///How to work with dates and times using java
        /// (LocalDate, LocalTime, LocalDateTime, UTC timestamp)


        LocalDate date= LocalDate.now();
        LocalTime time= LocalTime.now();
        LocalDateTime datetime= LocalDateTime.now();

        Instant instant= Instant.now();



        System.out.println(time);
        System.out.println(date);
        System.out.println(datetime);
        System.out.println(instant);


        /// Custom format

        LocalDateTime dateTime= LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        String newDateTime= dateTime.format(formatter);
        System.out.println(newDateTime);


        LocalDate data= LocalDate.of(2024, 12,25);
        System.out.println(date);


        LocalDateTime date1= LocalDateTime.of(2025, 12 ,25,12,0,0);
        System.out.println(date1);





    }


}
