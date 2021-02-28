package by.jonline.task02.main;

import by.jonline.task01.main.TaskHelper;

public class Task_02_01 {

	public static void main(String[] args) {
		/*
		 * The array A [N] contains natural numbers. 
		 * Find the sum of those elements that are multiples of a given K.
		 */
		
		
		int arrayDimension = 100; //Array dimension
		long maxNumber = 32000; // max number for array elements
		long sumElements = 0;
		
		long arrayA [] = new long[arrayDimension];
		
		TaskHelper helper = new TaskHelper();
		String strCharM = helper.GetUserInput("Input k: ");
		
		long k = Long.parseLong(strCharM); // given k
		
		
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = (long) (Math.random() *  maxNumber); // fill the array
		}
		
		for (int j = 0; j<arrayDimension; j++) {
			if ((arrayA[j] % k) == 0) {
				sumElements = sumElements + arrayA[j]; 
			}
		}
		System.out.println("Sum of the elements multiples of " + k + " is: " + sumElements);
	}

}
