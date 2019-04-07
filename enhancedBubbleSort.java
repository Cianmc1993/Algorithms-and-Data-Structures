import java.util.*;
public class enhancedBubbleSort extends array
{
   public static int swaps, comparisons;
   
   public static void enhancedBubbleSort(int[] array)
   {
      int temp;
      int n = array.length;
      boolean sorted = false;
      comparisons = 0;
      swaps = 0;
         
         for(int i = array.length-1; i > 0 ; i--)
         {
            sorted = true;
            for(int j = 0; j < i; j++)
            {
               comparisons++; 
               if(array[j] > array[j+1])
               {
                  swaps++;
                  temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;
                  sorted = false;
               }
            }     
               if(sorted)
                  return;
         }
   }
   
   public int getComparisons(){
      return comparisons;
   }
   
   public int getSwaps(){
      return swaps;
   }

}
