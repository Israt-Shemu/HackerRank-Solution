import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {
        DateAndTime res = new DateAndTime();
        System.out.println(res.findDay(8, 19, 2022));
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;


    }
}
