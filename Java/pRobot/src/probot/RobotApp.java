/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package probot;

/**
 *
 * @author Dave
 */
public class RobotApp {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Making the robots");
        
        Robot machine1 = new Robot("R2D2", "Solar");
        Robot machine2 = new Robot("C3P0", "Li-On");
        
        System.out.println(machine1.getName() + " runs on " + machine1.getFuel());
        System.out.println(machine2.getName() + " runs on " + machine2.getFuel());
    }
}
