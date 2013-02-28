/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmyfirst;

import java.util.Random;

/**
 *
 * @author Dave
 */
public class MyFirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("my first line");
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(20, 18));
        
        Random generator = new Random();
        int dice = (generator.nextInt(6) + 1);
        System.out.println(dice);
        System.out.println("Number is a static class variable");
        
    }
}
