/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psorting;

import junit.framework.TestCase;

/**
 *
 * @author Dave
 */
public class SortTest extends TestCase {
    
    public SortTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of SelectionSort method, of class Sort.
     */
    public void testSelectionSort() {
        System.out.println("SelectionSort");
        int[] numbers = null;
        Sort instance = new Sort();
        int[] expResult = null;
        int[] result = instance.SelectionSort(numbers);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BubbleSort method, of class Sort.
     */
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] numbers = null;
        Sort instance = new Sort();
        int[] expResult = null;
        int[] result = instance.BubbleSort(numbers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
