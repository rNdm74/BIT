/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbox;

    
/**
 *
 * @author Dave
 */
public class Box {
    
    private double bHeight;
    private double bLength;
    private double bWidth;
    
    public Box(double bHeight, double bLength, double bWidth)
    {
        this.bHeight = bHeight;
        this.bLength = bLength;
        this.bWidth = bWidth;
    }
    
    public Box(double squareBase, double bHeight)
    {
        this.bHeight = bHeight;
        
        this.bLength = this.bWidth = squareBase / bHeight;
    }
    
    public Box(double side)
    {
        this.bHeight = this.bLength = this.bWidth = side;
    }

    public double getbWidth() {
        return bWidth;
    }

    public void setbWidth(double bWidth) {
        this.bWidth = bWidth;
    }
    
    public double getbLength() {
        return bLength;
    }

    public void setbLength(double bLength) {
        this.bLength = bLength;
    }
    
    public double getbHeight() {
        return bHeight;
    }

    public void setbHeight(double bHeight) {
        this.bHeight = bHeight;
    }
    
    public double calcVolume()
    {
        return bLength * bWidth * bHeight;
    }
    
    public double getSurfaceArea()
    {
        return 2 * (bLength * bWidth) + 2 * (bLength * bHeight) + 2 * (bWidth * bHeight);
    }
    
    @Override
    public String toString()
    {
        return "Height:" + bHeight + 
                "\nWidth:" + bWidth +
                "\nHeight:" + bHeight +
                "\nVolume:" + calcVolume() +
                "\nSurface Area:" + getSurfaceArea();
    }
    }
    
