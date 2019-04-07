import java.util.*;
public class BubbleSort extends array
{
   public static int swaps, comparisons;
   
   public static void BubbleSort(int[] array)
   {
      comparisons = 0;
      swaps = 0;
      int temp;
      int n = array.length;
         
      for(int i = 0; i < n-1; i++)
      {
         for(int j = 0; j < n-1; j++)
         {
            comparisons++;
            if(array[j] > array[j+1])
            {
               swaps++;
               temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
            }
         }
      }
   }

      
   public static void BubbleSortInverse(int[] array)
   {
      int temp;
      int n = array.length;
         
      for(int i = 0; i < n-1; i++)
      {
         for(int j = 0; j < n-1; j++)
         {
            if(array[j] < array[j+1])
            {
               temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
            }
         }
      }
   }
   
   public static void printArray(int[] arr)
   {  
      for(int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " ");
      }
         System.out.print("\n");
   }
   
   public static void PrintFirst3Passes(int[] array)
   {
      int temp;
         
      for(int i = 0; i < array.length-1; i++)
      {  
      if(i<3)
      {
      System.out.println("Bubble sort iteration: " + i);
      System.out.println(Arrays.toString(array));
      }
         for(int j = 0; j < array.length-1; j++)
         {
            if(array[j] > array[j+1])
            {
               temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
            }
         }
      }
   }
}
