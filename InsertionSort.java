import java.util.*;
public class InsertionSort extends array
{
   public static int swaps, comparisons;
   
   public static int[] InsertionSort(int[] list)
   {
      swaps = 0;
      comparisons = 0;
      
      for (int i = 1; i < list.length; i++) 
      {
         int next = list[i];
         int j = i;
         comparisons++;
         while (j > 0 && list[j-1] > next)
         {
            swaps++;
            list[j] = list[j-1];
            j--;
         }
            list[j] = next;
      }
         return list;
    }
    
   public static int[] InsertionSortInverse(int[] list)
   {
      for (int i = 1; i < list.length; i++) 
      {
         int next = list[i];
         int j = i;
         while (j > 0 && list[j-1] < next)
         {
            list[j] = list[j-1];
            j--;
         }
            list[j] = next;
      }
         return list;
   }
   
   public static int[] InsertionSort5Passes(int[] list)
   {
      for (int i = 1; i < list.length; i++) 
      {
         if(i<6)
         {
            System.out.println("Insertion sort iteration: " + (i-1));
            System.out.println(Arrays.toString(list));
         }
            int next = list[i];
            int j = i;
            while (j > 0 && list[j-1] > next)
         {
            list[j] = list[j-1];
            j--;
         }
            list[j] = next;
      }
         return list;
    }

}