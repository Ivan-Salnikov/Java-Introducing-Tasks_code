package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02b_05 {

	public static void main(String[] args) {
		/*
		 * Sort by inserts. You are given a sequence of numbers a_1, a_2, ...,a_n. 
		 * It is required to rearrange the numbers in ascending order. 
		 * This is done as follows. Let a_1, a_2,...,a_i - an ordered sequence, i.e., a_1<=a_2<=...<=a_i. 
		 * The next number a_i+1 a is taken and inserted into sequence so that the new sequence is also increasing. 
		 * The process is carried out until all elements from i +1 to n are enumerated. 
		 * Note. Place the next element in the sorted part using a binary search. 
		 * Binary search should be presented as a separate function.
		 */
		
		
		int arrayA [] = new int[] {42, 625, 9, 79, 42, 112, 21, 8, 99, 5, 553};
		
				
		int temp; // Temporary variable for keeping current value of the sorting number

		
		System.out.println("Sequence before sorting is " + Arrays.toString(arrayA));	
		
		for (int i = 0; i < arrayA.length; i++) {
			
			temp = arrayA[i];
			
			
			int k = BinarySearch(arrayA, 0, i, temp); //Looking for a place to insert 

			for (int j = i; j >= k+1; j--) {				
				arrayA[j] = arrayA[j-1]; //Shift all values to right
				}				
			
			arrayA[k]  = temp;
			}
			
	
		
		System.out.println("Sequence after sorting is  " + Arrays.toString(arrayA));

		
	}
	
	public static int BinarySearch(int[] arr, int lowPosition, int highPosition, int keyValue)
	  {
	    
		int midPosition;
		
		while(lowPosition < highPosition){
	      
			midPosition = lowPosition + (highPosition - lowPosition) / 2; // Middle of the already sorted sequence
			
	      
			int valueMidPosition = arr[midPosition];
			
	      
			if (valueMidPosition < keyValue) {
				lowPosition = midPosition + 1;
	        } else if (valueMidPosition > keyValue) {
	            highPosition = midPosition;
	        } else if (valueMidPosition == keyValue) {
	        	lowPosition = midPosition;
	            break;
	        }
	    }
		return lowPosition;
	  }

}