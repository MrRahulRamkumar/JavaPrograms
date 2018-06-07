package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Crunchify.com
 *
 */

public class CrunchifyEpochTime {

    public static void main(String[] args) throws ParseException {


        String dateInput = "2018-04-20T19:39:29Z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        Date dateObject = simpleDateFormat.parse(dateInput.replaceAll("Z$", "+0000"));
        long epoch = dateObject.getTime();
        System.out.println(dateObject);
        System.out.println(epoch);

        /*String str = "Jun 13 2003 23:11:52.454 UTC";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        Date date = df.parse(str);
        long epoch = date.getTime();
        System.out.println(epoch);*/



    }

}