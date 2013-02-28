/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psimplemaths;

import java.util.Random;
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
public class SimpleMathsTest {
    
    public SimpleMathsTest() {
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
     * Test of doAddition method, of class SimpleMaths.
     */
    
    @Test
    public void testGetBiggest()
    {
        float a = 10.0F;
        float b = 10.0F;
        float c = 10.0F;
        SimpleMaths instance = new SimpleMaths();
        float expResult = 10.0F;
        float result = instance.getBiggest(a, b);
        assertEquals(expResult, result, 0.0);
        
        result = instance.getBiggest(a, b, c);
        assertEquals(expResult, result, 0.0);
        
        a = 20.0F;
        b = -10.0F;
        c = 33.0F;
        expResult = 20.0F;
        result = instance.getBiggest(a, b);
        assertEquals(expResult, result, 0.0);
        expResult = 33.0F;
        result = instance.getBiggest(a, b, c);
        assertEquals(expResult, result, 0.0);
        
        
        
        
    }
    
    @Test (expected = NullPointerException.class)
    public void testGetAverageNull()
    {
        int[] numbers = null;
        SimpleMaths instance = new SimpleMaths();
        float expResult = 8.25F;
        float result = instance.getAverage(numbers);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testGetAverage()
    {
        int[] numbers = {10,12,8,9,12,6,7,2};
        SimpleMaths instance = new SimpleMaths();
        float expResult = 8.25F;
        float result = instance.getAverage(numbers);
        assertEquals(expResult, result, 0.0);
        
        numbers = new int[]{-10, 15, 2 , 8,12,6,7,2};
        expResult = 5.25F;
        result = instance.getAverage(numbers);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testDoAddition() {
        System.out.println("doAddition");
        // test 1
        float a = 4.0F;
        float b = 12.0F;
        SimpleMaths instance = new SimpleMaths();
        float expResult = 16.0F;
        float result = instance.doAddition(a, b);
        assertEquals(expResult, result, 0.0);
        // test 2
        a = 10.5F;
        b = 12.1F;
        expResult = 22.6F;
        result = instance.doAddition(a,b);
        assertEquals(expResult, result, 0.0);
        // test 3
        a = 2579.55F;
        b = 1289.12F;
        expResult = 3868.67F;
        result = instance.doAddition(a,b);
        assertEquals(expResult, result, 0.0);
        // test 4
        a = -12.0F;
        b = 13.0F;
        expResult = 1.0F;
        result = instance.doAddition(a,b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of doSubtraction method, of class SimpleMaths.
     */
    @Test
    public void testDoSubtraction() {
        System.out.println("doSubtraction");
        // test 1
        float a = 12.4F;
        float b = 2.1F;
        SimpleMaths instance = new SimpleMaths();
        float expResult = 10.3F;
        float result = instance.doSubtraction(a, b);
        assertEquals(expResult, result, 0.0001);
        //test 2
        a = 10.0F;
        b = 2.0F;
        expResult = 8.0F;
        result = instance.doSubtraction(a, b);
        assertEquals(expResult, result, 0.0);
        //test 3
        a = -5.5F;
        b = 12.0F;
        expResult = -17.5F;
        result = instance.doSubtraction(a, b);
        assertEquals(expResult, result, 0.0);
        //test 4
        a = 0.0002F;
        b = 256892.0F;
        expResult = -256891.9998F;
        result = instance.doSubtraction(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of doMultiplication method, of class SimpleMaths.
     */
    @Test
    public void testDoMultiplication() {
        System.out.println("doMultiplication");
        // test 1
        float a = 1572.0F;
        float b = 39.0F;
        SimpleMaths instance = new SimpleMaths();
        float expResult = 61308.0F;
        float result = instance.doMultiplication(a, b);
        assertEquals(expResult, result, 0.0);
        //test 2
        a = 10.0F;
        b = 2.0F;
        expResult = 20.0F;
        result = instance.doMultiplication(a, b);
        assertEquals(expResult, result, 0.0);
        //test 3
        a = 5.5F;
        b = 12.0F;
        expResult = 66.0F;
        result = instance.doMultiplication(a, b);
        assertEquals(expResult, result, 0.0);
        //test 4
        a = 0.0002F;
        b = 256892.0F;
        expResult = 51.3784F;
        result = instance.doMultiplication(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of doDivision method, of class SimpleMaths.
     */
    
    @Test
    public void testDoDivision() {
        System.out.println("doDivision");
        // test 1
        float a = 2.0F;
        float b = 1.0F;
        SimpleMaths instance = new SimpleMaths();
        float expResult = 2.0F;
        float result = instance.doDivision(a, b);
        assertEquals(expResult, result, 0.0);
        //test 3
        a = 5.5F;
        b = 12.0F;
        expResult = 0.4583333333333F;
        result = instance.doDivision(a, b);
        assertEquals(expResult, result, 0.0);
        //test 4
        a = 10.0F;
        b = 2.0F;
        expResult = 5.0F;
        result = instance.doDivision(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test (expected = AssertionError.class)
    public void testDoDivisionWithZero() {
        System.out.println("doDivision");
        // test 1
        float a = 2.0F;
        float b = 0.0F;
        SimpleMaths instance = new SimpleMaths();
        float expResult = 2.0F;
        float result = instance.doDivision(a, b);
        assertEquals(expResult, result, 0.0);
    }
}
