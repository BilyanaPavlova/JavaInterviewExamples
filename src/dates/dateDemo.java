package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args) {

        //SimpleDateFormat -> https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        //default date
        Date d = new Date();
        System.out.println(d.toString());

        //formated date
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String formatedDate = sdf.format(d);
        System.out.println(formatedDate);

        // other ways of format
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss a");
        String formatedDate1 = sd.format(d);
        System.out.println(formatedDate1);



    }
}
