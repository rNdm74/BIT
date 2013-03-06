/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbirthday;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Dave
 */
public class BirthdayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar today = Calendar.getInstance();
        
        String birthday = (String)JOptionPane.showInputDialog("What is your Birthday:? (dd/mm/yyyy)");
        
        int year = Integer.parseInt(birthday.substring(6));
        int month = Integer.parseInt(birthday.substring(3,5));
        int day = Integer.parseInt(birthday.substring(0,2));
        
        GregorianCalendar birthDate = new GregorianCalendar(year,month,day);
        
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        
        if (today.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) || today.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH)  )
        {
            age--;
        }
        
        if (today.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH))
        {
            if (today.get(Calendar.DATE) > birthDate.get(Calendar.DATE) || today.get(Calendar.DATE) == birthDate.get(Calendar.DATE)  )
            {
                age++;
            }
        }
        
        
        
        System.out.println("You are:" + age + "years old!");
    }
}
