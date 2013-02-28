/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psimplemaths;

/**
 *
 * @author Dave
 */
public class SimpleMaths {
    
    public float doAddition(float a, float b)
    {
        return a + b;
    }
    
    public float doSubtraction(float a, float b)
    {
        return a - b;
    }
    
    public float doMultiplication(float a, float b)
    {
        return a * b;
    }
    
    public float doDivision(float a, float b)
    {
        return a / b;
    }
    
    public float getBiggest(float a, float b)
    {
        return a > b ? a : b;
    }
    
    public float getBiggest(float a, float b, float c)
    {
        float bigger = a > b ? a:b;
        return bigger > c ? bigger : c;
    }
    
    public float getAverage(int[] numbers)
    {
        if (numbers == null)
            throw new NullPointerException("Array is Null");
        int runTot = 0;
        for (int i = 0; i < numbers.length; i++)
        {       
            runTot += numbers[i];
        }
        return (float)runTot / (float)numbers.length;
    }
}
