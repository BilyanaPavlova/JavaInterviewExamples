package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

//    Calendar class has much more methods than Date class.
//    You can extract different paarts of the date for example

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance(); //instantiate a new cal object (Calendar is static)
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss a");
        String formated = sdf.format(cal.getTime());
        System.out.println(formated);

        System.out.println(cal.getFirstDayOfWeek());
        System.out.println(cal.getWeekYear());
        System.out.println(cal.getCalendarType());

        Calendar cal1 = cal;
        cal1.set(2000,Calendar.JANUARY,10);
        System.out.println(cal1.getTime());

        int january = Calendar.JANUARY;
        System.out.println(january);

        int february = Calendar.FEBRUARY;
        System.out.println(february);


    }

}
