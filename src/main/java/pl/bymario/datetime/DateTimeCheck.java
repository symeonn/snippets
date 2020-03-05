package pl.bymario.datetime;



import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCheck {
    public static void testZoneDateTime() {

//        ZonedDateTime z = ZonedDateTime.parse("2014 09 03", DateTimeFormatter.ofPattern("y M d"));
//        ZonedDateTime m = ZonedDateTime.parse("2012 06 30 12 30 40", DateTimeFormatter.ofPattern("y M d H m s"));
// 2012-06-30T12:30:40+01:00[Europe/London]

        System.out.println(ZonedDateTime.now().withYear(2013).withMonth(3).withDayOfMonth(15));

    }

    public void equalsDates() {

        ZonedDateTime startDate = ZonedDateTime.now();
        ZonedDateTime endDate = startDate.plusDays(2);


        System.out.println(startDate.equals(endDate));

    }

    public void truncateToMinutes() {

        ZonedDateTime now = ZonedDateTime.now();


        System.out.println(now);

        System.out.println(now.truncatedTo(ChronoUnit.MINUTES));

        //        log.warn("StudentTestExercise: {} not found", id);



    }
}
