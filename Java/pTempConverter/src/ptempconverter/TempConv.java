package ptempconverter;


import java.text.DecimalFormat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class TempConv {
    
    private double cel;
    private double fah;
    private double kel;
    
    public TempConv(double cel)
    {
        this.cel = cel;
        this.fah = (cel * 1.8) + 32;
        this.kel = cel + 273.15; 
    }
    
    public double getCel() {
        return cel;
    }

    public void setCel(double cel) {
        this.cel = cel;
        this.fah = (cel * 1.8) + 32;
        this.kel = cel + 273.15; 
    }

    public double getFah() {
        return fah;
    }

    public void setFah(double fah) {
        this.fah = fah;
        this.cel = ((fah - 32) * 0.55);
        this.kel = ((fah + 459.67) * 0.55); 
    }

    public double getKel() {
        return kel;
    }

    public void setKel(double kel) {
        this.kel = kel;
        this.cel = kel - 273.15;
        this.fah = kel * 1.8 - 459.67;             
    }
    
    public String toString()
    {
        DecimalFormat formater = new DecimalFormat("0.##");
        return formater.format(cel) + " C = " + formater.format(fah) + " F = " + formater.format(kel) + " K";
    }
    
}
