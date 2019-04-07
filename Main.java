import java.util.*;

public class Main
{
	public static int[] myArray;
	public static int[] tempArray;
	public static BubbleSort bubbleSort = new BubbleSort();
	public static enhancedBubbleSort enhanced = new enhancedBubbleSort(); 
	public static SelectionSort select = new SelectionSort();
	public static InsertionSort insert = new InsertionSort();
	public static ArrayList<String> results = new ArrayList<String>();
	public static String dataType = ""; 
	public static int dataSize = 0; 

	public static void main(String [] args)
	{
		Scanner keyIn = new Scanner(System.in);

		StopWatch stopwatch = new StopWatch();

		int choice;
      selectArraySize();
		do{

			selectArrayType();

			System.out.println("Select sorting method");
			System.out.println("1. Bubble Sort");
			System.out.println("2. Enhanced Bubble Sort");
			System.out.println("3. Selection Sort");
			System.out.println("4. Insertion Sort");
		
			System.out.print("Enter choice: ");

			choice = keyIn.nextInt();

			switch(choice)
			{
			case 1:

				myArray = tempArray.clone();
				stopwatch.start();
				bubbleSort.BubbleSort(myArray);
				stopwatch.stop();
				System.out.println("Elapsed Time: "+stopwatch.getElapsedTime());
				System.out.println("Swaps: " + bubbleSort.swaps);
				System.out.println("Comparisons: " + bubbleSort.comparisons);
				System.out.println("\n");
				logResults("Standard BS", dataType, dataSize, bubbleSort.swaps, bubbleSort.comparisons, stopwatch.getElapsedTime());

				break;
			case 2:

				myArray = tempArray.clone();
				stopwatch.start();
				enhanced.enhancedBubbleSort(myArray);
				stopwatch.stop();
				System.out.println("Elapsed Time: "+stopwatch.getElapsedTime());
				System.out.println("Swaps: " + enhanced.getSwaps());
				System.out.println("Comparisons: " + enhanced.getComparisons());
				System.out.println("\n");
				logResults("Enhanced BS", dataType, dataSize, enhanced.swaps, enhanced.comparisons, stopwatch.getElapsedTime());

				break;
			case 3:

				myArray = tempArray.clone();
				stopwatch.start();
				select.SelectionSort(myArray);
				stopwatch.stop();
				System.out.println("Elapsed Time: "+stopwatch.getElapsedTime());
				System.out.println("Swaps: " + select.swaps);
				System.out.println("Comparisons: " + select.comparisons);
				System.out.println("\n");
				logResults("Selection  ", dataType, dataSize, select.swaps, select.comparisons, stopwatch.getElapsedTime());

				break;
			case 4:

				myArray = tempArray.clone();
				stopwatch.start();
				insert.InsertionSort(myArray);
				stopwatch.stop();
				System.out.println("Elapsed Time: "+stopwatch.getElapsedTime());
				System.out.println("Swaps: " + insert.swaps);
				System.out.println("Comparisons: " + insert.comparisons);
				System.out.println("\n");
				logResults("Insertion  ", dataType, dataSize, insert.swaps, insert.comparisons, stopwatch.getElapsedTime());

				break;
			default:
				System.out.println("Invalid choice");
			} // end switch

			System.out.println("Test Again? ");
			System.out.println("0. No, Print Results");
         System.out.println("1. Yes");
         System.out.println("2. Print results & Change array size");
         System.out.print("Enter choice: ");
			choice = keyIn.nextInt();
			switch(choice)
			{
			case 0:
				printResults();
				break;
         case 2:
            printResults();
            System.out.println("");
            selectArraySize();
            break;			}
		}while(choice != 0);
	}  // end main

	public static void selectArraySize()
	{
		Scanner keyIn1 = new Scanner(System.in);

		System.out.println("Select array size");
		System.out.println("1. 1000");
		System.out.println("2. 10,000");
		System.out.println("3. 100,000");
		System.out.print("Enter choice: ");
		int size = keyIn1.nextInt();

		switch(size)
		{
		case 1:
		{
			myArray = new int[1000];
			tempArray = new int[1000];
			bubbleSort.propogateArray(tempArray);
			dataSize = 1000;
		}break;
		case 2:
		{
			myArray = new int[10000];
			tempArray = new int[10000];
			bubbleSort.propogateArray(tempArray);
			dataSize = 10000;
		}break;
		case 3:
		{
			myArray = new int[100000];
			tempArray = new int[100000];
			bubbleSort.propogateArray(tempArray);
			dataSize = 100000;
		}break;
		default:
			System.out.println("Invalid choice");
		}
		System.out.println("\n");
	}

	public static void selectArrayType()
	{
		Scanner keyIn1 = new Scanner(System.in);

		System.out.println("Select array type");
		System.out.println("1. Random ");
		System.out.println("2. Sorted ");
		System.out.println("3. Inverse");
		System.out.print("Enter choice: ");
		int type = keyIn1.nextInt();

		switch(type)
		{
		case 1:
		{  //Propogating a unsorted array
			bubbleSort.propogateArray(tempArray);
			dataType = "Random";
		}break;
		case 2:
		{  //Propogating a sorted array
			bubbleSort.propogateSortedArray(tempArray);
			dataType = "Sorted";
		}break;
		case 3:
		{  //Propogating an inverse array
			bubbleSort.propogateInverseArray(tempArray);
			dataType = "Inverse";
		}break;
		default:
			System.out.println("Invalid choice");
		}
		System.out.println("\n");

	}
   //Method to log results to an arraylist
	public static void logResults(String name, String dataType, int dataSize, int swaps, int comparisons, long time) 
   {
      //Adding results to the arraylist
		results.add("Algorithm: "+name+" | Data: "+dataType+" | Data size: "+dataSize+" | Swaps: "+swaps+" | Comparisons: "+comparisons+" | Time: "+time);
	}

	public static void printResults() 
   {
		for(int i=0; i<results.size(); i++)
      {
			System.out.println(results.get(i));
		}
	}

}

