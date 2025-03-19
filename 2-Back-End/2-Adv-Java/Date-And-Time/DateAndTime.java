import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        // LocalDate
        LocalDate d = LocalDate.now();
        System.out.println("Today: " + d);
        System.out.println();
        // LocalTime
        LocalTime t = LocalTime.now();
        System.out.println("Current time: " + t);
        System.out.println();
        // LocalDateTime
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Today: " + dt);
        System.out.println();
        // Methods in LocalDate
        System.out.println("Methods in LocalDate");
        System.out.println();
        // plus() in LocalDate
        System.out.println("plus() in LocalDate");
        System.out.println();
        System.out.println(d.plusDays(10));
        System.out.println(d.plusWeeks(4));
        System.out.println(d.plusMonths(3));
        System.out.println(d.plusYears(1));
        System.out.println(d.plusDays(5).plusMonths(2).plusYears(2));
        System.out.println();
        // minus() in LocalDate
        System.out.println("minus() in LocalDate");
        System.out.println();
        System.out.println(d.minusDays(20));
        System.out.println(d.minusMonths(1));
        System.out.println(d.minusWeeks(1));
        System.out.println(d.minusYears(1));
        System.out.println();
        // Methods in LocalTime
        System.out.println("Methods in LocalTime");
        System.out.println();
        // plus() in LocalTime
        System.out.println("plus() in LocalTime");
        System.out.println();
        System.out.println(t.plusMinutes(30));
        System.out.println(t.plusHours(2));
        System.out.println();
        // minus() in LocalTime
        System.out.println("minus() in LocalTime");
        System.out.println();
        System.out.println(t.minusMinutes(50));
        System.out.println(t.minusHours(4));
        System.out.println();
        // get() in LocalDate
        System.out.println("get() in LocalDate");
        System.out.println();
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println();
        System.out.println("get() in LocalTime");
        System.out.println();
        System.out.println(t.getMinute());
        System.out.println(t.getHour());
        System.out.println();
        // DateTimeFormatter
        System.out.println("DateTimeFormatter");
        System.out.println();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dtf.format(d);
        System.out.println("Date in format (dd-MM-yyyy): " + date);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E-MM-yyyy");
        String date1 = dtf1.format(d);
        System.out.println("Date in format (E-MM-yyyy): " + date1);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E-MMM-yyyy");
        String date2 = dtf2.format(d);
        System.out.println("Date in format (E-MMM-yyyy): " + date2);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("mm:ss:HH");
        String time = dtf3.format(t);
        System.out.println("Time in format (mm:ss:HH): " + time);
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("E-MM-yyyy mm:ss:HH");
        String time1 = dtf4.format(dt);
        System.out.println("DateTime in format (E-MM-yyyy mm:ss:HH): " + time1);
    }
}
