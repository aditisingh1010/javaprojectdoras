
package DigitalClock;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeProvider {
    private SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
    private SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

    public String getCurrentTime() {
        return timeFormat.format(Calendar.getInstance().getTime());
    }

    public String getCurrentDay() {
        return dayFormat.format(Calendar.getInstance().getTime());
    }

    public String getCurrentDate() {
        return dateFormat.format(Calendar.getInstance().getTime());
    }
}

