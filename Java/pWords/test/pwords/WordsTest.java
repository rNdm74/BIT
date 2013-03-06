/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pwords;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Dave
 */
public class WordsTest {
    
    public WordsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessage method, of class Words.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Words instance = new Words("Hello*My*Name*Is");
        String expResult = "Hello*My*Name*Is";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testExWords()
    {
        System.out.println("exWords");
        Words instance = new Words("Hello*My*Name*Is");
        String expResult = "Hello\nMy\nName\nIs";
        String result = instance.exWords();
        assertEquals(expResult, result);
        
    }
    /**
     * Test of reverseWords method, of class Words.
     */

    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        Words instance = new Words("Hello*My*Name*Is");
        String expResult = "Is Name My Hello";
        String result = instance.reverseWords();
        assertEquals(expResult, result);

    }
    
    /**
     * Test of toString method, of class Words.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Words instance = new Words("Hello*My*Name*Is");
        String expResult = "Hello*My*Name*Is backwards is:Is Name My Hello";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
