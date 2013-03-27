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
        for (int i = numbers.length - 1; i > 0; i--)  
        {
             int firstPos = 0; 
             for(int j = 1; j <= i; j++)
             {
                  if( numbers[j] < numbers[firstPos] )
                  {
                    firstPos = j;
                  }
             }
             int temp = numbers[firstPos];
             numbers[firstPos] = numbers[i];
             numbers[i] = temp; 
         } 
        
        return numbers;
    }
    
    public int[] BubbleSort(int[] numbers)
    {
            boolean swap = true;
            while (swap)
            {
                swap = false;
                for (int i = 0; i < numbers.length - 1; i++)
                {
                    if (numbers[i] > numbers[i + 1])
                    {
                        int temp = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = temp;
                        swap = true;
                    }
                }
            }
            
            return numbers;
        }
}
