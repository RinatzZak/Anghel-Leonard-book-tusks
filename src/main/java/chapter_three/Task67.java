package chapter_three;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Написать программу, которая показывает местное время во всех имеющихся
 * часовых поясах.
 */

public class Task67 {

    public static void main(String[] args) {
        DateTime now = new DateTime(System.currentTimeMillis(), DateTimeZone.forID("UTC"));
        System.out.println("Current time is: " + now);
        String[] zoneIds = TimeZone.getAvailableIDs();
        for (int i = 0; i < zoneIds.length; i++) {
            TimeZone tz = TimeZone.getTimeZone(zoneIds[i]);
            System.out.print(tz.getID() + " " + tz.getDisplayName());
            Calendar calTZ = new GregorianCalendar(tz);
            calTZ.setTimeInMillis(new Date().getTime());
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, calTZ.get(Calendar.YEAR));
            cal.set(Calendar.MONTH, calTZ.get(Calendar.MONTH));
            cal.set(Calendar.DAY_OF_MONTH, calTZ.get(Calendar.DAY_OF_MONTH));
            cal.set(Calendar.HOUR_OF_DAY, calTZ.get(Calendar.HOUR_OF_DAY));
            cal.set(Calendar.MINUTE, calTZ.get(Calendar.MINUTE));
            cal.set(Calendar.SECOND, calTZ.get(Calendar.SECOND));
            cal.set(Calendar.MILLISECOND, calTZ.get(Calendar.MILLISECOND));
            System.out.println("  " + cal.getTime());
        }
    }
}
