/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dave
 */
public class DiceTest {
    
    public DiceTest() {
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
     * Test of roll method, of class Dice.
     */
    @Test
    public void testRoll() {
        System.out.println("roll");
        int result;
        Dice instance = new Dice();
        for (int i = 0; i < 100; i++)
        {
        result = instance.roll();
        assertTrue("range acceptable", result > 0 && result <= 6);
        }
    }

    /**
     * Test of toString method, of class Dice.
     */
    
}
