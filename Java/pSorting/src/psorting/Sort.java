/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psorting;

/**
 *
 * @author Dave
 */
public class Sort {
    
    public int[] SelectionSort(int[] numbers)
    {
        int comp = 0;
        int swap = 0;
        
        for (int i = numbers.length - 1; i > 0; i--)  
        {
             int firstPos = 0; 
             for(int j = 1; j <= i; j++)
             {
                 comp++;
                  if( numbers[j] < numbers[firstPos] )
                  {
                    firstPos = j;
                    swap++;
                  }
             }
             int temp = numbers[firstPos];
             numbers[firstPos] = numbers[i];
             numbers[i] = temp; 
         } 
        System.out.println("Comparisons: " + comp + "\nSwaps: " + swap);
        return numbers;
    }
    
    public int[] BubbleSort(int[] numbers)
    {
            int comp = 0;
            int swapd = 0;
            boolean swap = true;
            while (swap)
            {
                swap = false;
                for (int i = 0; i < numbers.length - 1; i++)
                {
                    comp++;
                    if (numbers[i] > numbers[i + 1])
                    {
                        int temp = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = temp;
                        swap = true;
                        swapd++;
                    }
                }
            }
            
            System.out.println("Comparisons: " + comp + "\nSwaps: " + swapd);
            return numbers;
        }
}
