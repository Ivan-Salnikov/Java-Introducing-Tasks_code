package by.jonline.task02.main;

import by.jonline.task01.main.TaskHelper;

public class Task_02_02 {

	public static void main(String[] args) {
		/*
		 * A sequence of real numbers a1, a2, ..., an is given. 
		 * Replace all members larger than the given Z with this number. 
		 * Count the number of replacements.
		 */

		int arrayDimension = 100; //Array dimension
		long maxNumber = 32000; // max number for array elements
		long countOfReplacements = 0;
		
		double arrayA [] = new double[arrayDimension];
		
		TaskHelper helper = new TaskHelper();
		String strCharM = helper.GetUserInput("Input Z: ");
		
		double z = Double.parseDouble(strCharM); // given z
		
		
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = (Math.random() *  maxNumber); // fill the array
		}
		
		for (int j = 0; j<arrayDimension; j++) {
			if (arrayA[j] > z) {
				
				System.out.println("Replace " + arrayA[j] + " to " + z);
				arrayA[j] = z;
				countOfReplacements++;
				
			}
		}
		System.out.println("Count Of replacements is: " + countOfReplacements);
	}

}
