/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psorting;

import java.util.Arrays;
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
        int[] arr = {5,8,2,3,1};
        int[] exp = {1,2,3,5,8};
        Sort instance = new Sort();
        arr = instance.SelectionSort(arr);
        assertTrue(Arrays.equals(exp,arr));
        
    }

    /**
     * Test of BubbleSort method, of class Sort.
     */

    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] arr = {5,8,2,3,1};
        int[] exp = {1,2,3,5,8};
        Sort instance = new Sort();
        arr = instance.BubbleSort(arr);
        assertTrue(Arrays.equals(exp,arr));
    }
}
