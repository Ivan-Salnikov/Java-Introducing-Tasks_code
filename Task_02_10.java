package by.jonline.task02.main;

import java.util.ArrayList;

public class Task_02_10 {

	public static void main(String[] args) {
		/*
		 * An integer array is given with the number of elements n. 
		 * Compress the array, throwing out every second element (fill the vacated elements with zeros). 
		 * Note. Do not use an additional array.
		 */
		
		int arrayDimension = 100; //Array dimension
		long maxNumber = 20; // max number for array elements
		long minNumber = -20; // min number for array elements				
		
	
		ArrayList<Long> myList = new ArrayList<>();
		
		for (int i = 0; i < arrayDimension; i++) {
			myList.add((long)(minNumber + (int) (Math.random() *  (maxNumber - minNumber)))); // fill the array
			
		}
		
		System.out.println("Initial Array are: " + myList);

		for (int j = 0; j < arrayDimension; j++) {
			
			if ((j + 1) % 2 == 0) {
				myList.set(j, (long) 0);

			}
			
			
		}
		
		System.out.println("Following Array are: " + myList);
	}

}
