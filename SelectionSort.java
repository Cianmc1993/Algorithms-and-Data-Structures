import java.util.*;
public class SelectionSort extends array
{
   public static int swaps, comparisons;
   
   public static int[] SelectionSort(int[] arr)
   {
   swaps = 0;
   comparisons = 0;
         
   for (int i = 0; i < arr.length-1; i++)	
	{
	   int minimum = i;	
     	for(int j = i+1; j < arr.length; j++)
	   {
         comparisons++;			   
   	   if(arr[j] < arr[minimum])	// compare current element to minimum
         {
      	   minimum = j; // if it's lower, it becomes the new minimum
            swaps++;
         }
  	   }
	   // swap the two values
         
      	int temp = arr[i]; 
      	arr[i] = arr[minimum];
      	arr[minimum] = temp;
   	}
         return arr;
   }
   
   public static int[] SelectionSortInverse(int[] arr)
   {
         
   for (int i = 0; i < arr.length-1; i++)	 
	{
	   int minimum = i;	
	   for(int j = i+1; j < arr.length; j++)	 
	   {			   
   	   if(arr[j] > arr[minimum])	// compare current element to minimum
         {
   	      minimum = j;	// if it's higher, it becomes the new minimum
         }
	   }
   	   // swap the two values
      	int temp = arr[i]; 
      	arr[i] = arr[minimum];
      	arr[minimum] = temp;
   }
         return arr;
   }
   
   public static int[] SelectionSort4Passes(int[] arr)
   {
         
   for (int i = 0; i < arr.length-1; i++)	
	{
      if(i<4)
      {
         System.out.println("Selection sort iteration: " + i);
         System.out.println(Arrays.toString(arr));
      }
	   int minimum = i;	
     	for(int j = i+1; j < arr.length; j++)
	   {			   
   	   if(arr[j] < arr[minimum])	// compare current element to minimum
   	   minimum = j;	// if it's lower, it becomes the new minimum
	   }
	      // swap the two values
      	int temp = arr[i]; 
      	arr[i] = arr[minimum];
      	arr[minimum] = temp;
   	}
         return arr;
   }
   
   public static void printArray(int[] arr)
   {
      for(int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " ");
      }
      
      SelectionSort(arr);
      System.out.print("\n");
      
      for(int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " ");
      }
   }

} 