/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Dave
 */
public class DateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        
        System.out.println(
                "YEAR:" + cal.get(Calendar.YEAR) + "\n" +
                "MONTH:" + (cal.get(Calendar.MONTH) + 1) + "\n" +
                "WEEK_OF_MONTH:" + cal.get(Calendar.WEEK_OF_MONTH) + "\n" +
                "DATE:" + cal.get(Calendar.DATE) + "\n" +
                "DAY_OF_MONTH:" + cal.get(Calendar.DAY_OF_MONTH) + "\n" +
                "DAY_OF_YEAR:" + cal.get(Calendar.DAY_OF_YEAR) + "\n" +
                "DAY_OF_WEEK:" + cal.get(Calendar.DAY_OF_WEEK) + "\n" +
                "AM_PM:" + cal.get(Calendar.AM_PM) + "\n" +
                "HOUR:" + cal.get(Calendar.HOUR) + "\n" +
                "HOUR_OF_DAY:" + cal.get(Calendar.HOUR_OF_DAY) + "\n" +
                "MINUTE:" + cal.get(Calendar.MINUTE) + "\n" +
                "SECOND:" + cal.get(Calendar.SECOND) + "\n" +
                "MILISECOND:" + cal.get(Calendar.MILLISECOND));                
    }
}
