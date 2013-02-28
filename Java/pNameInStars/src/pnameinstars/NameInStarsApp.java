/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pnameinstars;

import javax.swing.JOptionPane;

/**
 *
 * @author Dave
 */
public class NameInStarsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Enter your name");
        NameInStars you = new NameInStars(userName);
        JOptionPane.showMessageDialog(null, you.surroundNameInStars());
    }
}
