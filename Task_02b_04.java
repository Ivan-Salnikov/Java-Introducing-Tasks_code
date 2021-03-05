package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02b_04 {

	public static void main(String[] args) {
		/*
		 * Sorting by exchanges. 
		 * Given a sequence of numbers a1>=a2>=a3>=...>=an 
		 * It is required to rearrange the numbers in ascending order. 
		 * For this, two adjacent numbers a_i and a_(i+1) are compared. 
		 * If a_i > a_(i+1), then a permutation is done. 
		 * This continues until all the elements are arranged in ascending order. 
		 * Create a sorting algorithm, while counting the number of permutations.
		 */
		
		
		int arrayA [] = new int[] {999, 625, 455, 79, 42, 42, 21, 8, 7, 5, 3};
		
				
		int temp;
		int count = 0;
		
		boolean isDone = false;
		
		while (isDone == false) {
			isDone = true;
			
			for (int i = 0; i < arrayA.length - 1; i++) {
								
				if (arrayA[i] > arrayA [i+1]) {
					
					temp = arrayA[i];
					
					arrayA[i] = arrayA [i+1];
					
					arrayA [i+1] = temp;
					
					isDone = false;
					
					count++;
				}
				
			}
			
		}
		
		System.out.println("Array =  " + Arrays.toString(arrayA));
		System.out.println("Count of permutations is  " + count);
		
		
		
		
		
		
		
	}

}