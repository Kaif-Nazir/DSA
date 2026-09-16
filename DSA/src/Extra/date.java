import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class date {
    
    public static void main(String[] args) {
        
    int year = 2025;
    int month = 1; // January
    int day = 27;

    LocalDate date = LocalDate.of(year, month, day);
    DayOfWeek dw = date.getDayOfWeek();
    System.out.println(dw);
    Scanner sc = new Scanner(System.in);
    // String dayPassed = sc.next(); 
    /* String dayPassed = "2019/5/12";                                                    // Day Passed From 1st Day
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    System.out.println(LocalDate.parse(dayPassed, formatter).getDayOfYear()); */
    }
}
