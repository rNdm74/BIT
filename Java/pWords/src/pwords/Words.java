/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pwords;

/**
 *
 * @author Dave
 */
public class Words {
    
    private String message;
    private String word1;
    private String word2;
    private String word3;
    private String word4;
    
    public Words(String message)
    {
        this.message = message;
        
        int[] stars = new int[3];
        stars[0] = message.indexOf("*");
        stars[1] = message.indexOf("*", stars[0] + 1 );
        stars[2] = message.indexOf("*", stars[1] + 1 );
        word1 = message.substring(0,stars[0]);
        word2 = message.substring(stars[0] + 1,stars[1]);
        word3 = message.substring(stars[1] + 1,stars[2]);
        word4 = message.substring(stars[2] + 1);
        
    }

    public String getMessage() {
        return message;
    }
    
    public String exWords()
    {
        return word1 + "\n" +
                word2 + "\n" +
                word3 + "\n" +
                word4;
    }
    
    public String reverseWords()
    {
        return word4 + " " + word3 + " " +
                word2 + " " + word1;
    }
    
    public String toString()
    {
        return message + " backwards is:" + reverseWords();
    }
}
