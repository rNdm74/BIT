/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pnameinstars;

/**
 *
 * @author Dave
 */
public class NameInStars {
    private String name;
    
    public NameInStars(String name)
    {
        this.name = name;
    }
    
    public String surroundNameInStars()
    {
        return ("****" + name + "****\n****" + name + "****\n****" + name + "****");
    }
}
