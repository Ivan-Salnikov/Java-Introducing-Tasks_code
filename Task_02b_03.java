package by.jonline.task02.main;


public class Task_02b_03 {

	public static void main(String[] args) {
		/*
		 * Sort by selection. 
		 * Given a sequence of numbers a1<=a2<=....an. 
		 * It is required to rearrange the elements so that they are in descending order. 
		 * To do this, in the array, starting from the first, the largest element is selected and put in first place, and the first in place.
		 */
		
		
		int arrayA [] = new int[] {5, 6, 7, 8, 21, 42, 42, 79, 455, 625, 999};
				
		int temp;
		
		for (int i = 0; i < arrayA.length; i++) {
			
			if (i < arrayA.length / 2) {
				temp = arrayA[arrayA.length-1-i];
				
				arrayA[arrayA.length-1-i] = arrayA [i];
				
				arrayA [i] = temp;	
			}
								
			System.out.println("ArrayA[" + i + "] = " + arrayA [i]);
			
		}
		
		
		
		
		
	}

}