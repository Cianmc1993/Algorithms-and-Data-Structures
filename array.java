import java.util.*;

public class array
{
   public static Random rand = new Random();
   
      public int[] propogateArray(int[] x)
      {
         for(int i = 0; i < x.length; i++)
         {
            x[i] = rand.nextInt(x.length);
         }
         return x;
      }
      
      public int[] propogateSortedArray(int[] x)
      {
         for(int i = 0; i < x.length; i++)
         {
            x[i] = rand.nextInt(x.length);
         }
         BubbleSort bs = new BubbleSort();
         bs.BubbleSort(x);
         return x;
      }
      
      public int[] propogateInverseArray(int[] x)
      {
         for(int i = 0; i < x.length; i++)
         {
            x[i] = rand.nextInt(x.length);
         }
         BubbleSort bs = new BubbleSort();
         bs.BubbleSortInverse(x);
         return x;
      }


}
   