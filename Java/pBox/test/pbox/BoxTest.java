/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbox;

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
public class BoxTest {
    
    public BoxTest() {
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
     * Test of getbWidth method, of class Box.
     */
    @Test
    public void testGetbWidth() {
        //normal test
        System.out.println("getbWidth");
        Box instance = new Box(10,10,10);
        double expResult = 10;
        double result = instance.getbWidth();
        assertEquals(expResult, result, 0.0);
        //squareBase
        instance = new Box(25,10);
        expResult = 5;
        result = instance.getbWidth();
        assertEquals(expResult, result, 0.0);
        //side
        instance = new Box(10);
        expResult = 10;
        result = instance.getbWidth();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setbWidth method, of class Box.
     */
    @Test
    public void testSetbWidth() {
        System.out.println("setbWidth");
        double bWidth = 0.0;
        Box instance = null;
        instance.setbWidth(bWidth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbLength method, of class Box.
     */
    @Test
    public void testGetbLength() {
        System.out.println("getbLength");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getbLength();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setbLength method, of class Box.
     */
    @Test
    public void testSetbLength() {
        System.out.println("setbLength");
        double bLength = 0.0;
        Box instance = null;
        instance.setbLength(bLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbHeight method, of class Box.
     */
    @Test
    public void testGetbHeight() {
        System.out.println("getbHeight");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getbHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setbHeight method, of class Box.
     */
    @Test
    public void testSetbHeight() {
        System.out.println("setbHeight");
        double bHeight = 0.0;
        Box instance = null;
        instance.setbHeight(bHeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcVolume method, of class Box.
     */
    @Test
    public void testCalcVolume() {
        System.out.println("calcVolume");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.calcVolume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurfaceArea method, of class Box.
     */
    @Test
    public void testGetSurfaceArea() {
        System.out.println("getSurfaceArea");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getSurfaceArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Box.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Box instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
