/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ptempconverter;

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
public class TempConvTest {
    
    public TempConvTest() {
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
     * Test of getCel method, of class TempConv.
     */
    @Test
    public void testGetCel() {
        System.out.println("getCel");
        TempConv instance = new TempConv(20);
        double expResult = 20.0;
        double result = instance.getCel();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setCel method, of class TempConv.
     */
    
    @Test
    public void testSetCel() {
        System.out.println("setCel");
        double cel = 20.0;
        TempConv instance = new TempConv(50) ;
        instance.setCel(cel);
        double expResultCel = 20.0;
        double expResultFah = 68.0;
        double expResultKel = 293.15;
        double resultCel = instance.getCel();
        double resultFah = instance.getFah();
        double resultKel = instance.getKel();
        assertEquals(expResultCel, resultCel, 0.0);
        assertEquals(expResultFah, resultFah, 0.0);
        assertEquals(expResultKel, resultKel, 0.0);
        
    }

    /**
     * Test of getFah method, of class TempConv.
     */
    @Test
    public void testGetFah() {
        System.out.println("getFah");
        TempConv instance = new TempConv(20);
        double expResult = 68.0;
        double result = instance.getFah();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFah method, of class TempConv.
     */
            
    @Test
    public void testSetFah() {
        System.out.println("setFah");
        double fah = 120.0;
        TempConv instance = new TempConv(50) ;
        instance.setFah(fah);
        double expResultCel = 48.4;
        double expResultFah = 120;
        double expResultKel = 318.81;
        double resultCel = instance.getCel();
        double resultFah = instance.getFah();
        double resultKel = instance.getKel();
        assertEquals(expResultCel, resultCel, 0.01);
        assertEquals(expResultFah, resultFah, 0.01);
        assertEquals(expResultKel, resultKel, 0.01);
    }

    /**
     * Test of getKel method, of class TempConv.
     */
    @Test
    public void testGetKel() {
        System.out.println("getKel");
        TempConv instance = new TempConv(20);
        double expResult = 293.15;
        double result = instance.getKel();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setKel method, of class TempConv.
     */
    @Test
    public void testSetKel() {
        System.out.println("setKel");
        double kel = 258.0;
        TempConv instance = new TempConv(50) ;
        instance.setKel(kel);
        double expResultCel = -15.15;
        double expResultFah = 4.73;
        double expResultKel = 258.0;
        double resultCel = instance.getCel();
        double resultFah = instance.getFah();
        double resultKel = instance.getKel();
        assertEquals(expResultCel, resultCel, 0.01);
        assertEquals(expResultFah, resultFah, 0.01);
        assertEquals(expResultKel, resultKel, 0.01);
    }

    /**
     * Test of toString method, of class TempConv.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TempConv instance = new TempConv(20);
        String expResult = "20 C = 68 F = 293.15 K";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
