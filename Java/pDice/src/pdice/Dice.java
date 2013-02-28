/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdice;

import java.util.Random;

/**
 *
 * @author Dave
 */
public class Dice {
    
    private final int MAX = 6;
    
    private int faceValue;
    
    public Dice(){}
    
    public int roll()
    {
        return faceValue = new Random().nextInt(MAX) + 1;
    }
    
    @Override
    public String toString()
    {
        return "You rolled: " + roll();
    }
    
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * @param faceValue the faceValue to set
     */
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
    
    
    
}
