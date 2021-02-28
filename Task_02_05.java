package by.jonline.task02.main;

public class Task_02_05 {

	public static void main(String[] args) {
		/*
		 * Integers a1, a2, ..., an are given. 
		 * Print only those numbers for which ai> i.
		 */

		int arrayDimension = 100; //Array dimension
		long maxNumber = 32000; // max number for array elements
		long minNumber = -32000; // min number for array elements				
		
		long arrayA [] = new long[arrayDimension];
		
			
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = minNumber + (long)(Math.random() *  (maxNumber - minNumber)); // fill the array
		}
		
		
		for (int j = 0; j<arrayDimension; j++) {
			
			if(arrayA[j] > j) {
				
				System.out.println("Number " + arrayA[j] + " more than " + j);
			}
			
			
		}
		
		
		
	}

}
