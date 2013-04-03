/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psorting;

/**
 *
 * @author Dave
 */
public class SortingApp {

    
    
    public static void main(String[] args) {

        int[] numbers1 = {5,2,8,6,1,9,7,3,4};
        int[] numbers2 = {9,8,7,6,5,4,3,2,1};
        int[] numbers3 = {1,2,3,4,5,9,7,8,6};
        int[] numbers4 = {1,2,3,4,5,6,7,8,9};
        int[] numbers5 = {1,1,1,1,1,1,1,1,1};
        
        int[][] numbers = {numbers1, numbers2, numbers3, numbers4, numbers5};
        
        System.out.println("Bubble\n");
        
        for (int i = 0; i < numbers.length; i++)
        {
            new Sort().BubbleSort(numbers[i]);
            System.out.println();
        }
        
        System.out.println("Selection\n");
        
        for (int i = 0; i < numbers.length; i++)
        {
            new Sort().SelectionSort(numbers[i]);
            System.out.println();
        }
        
    }
}

