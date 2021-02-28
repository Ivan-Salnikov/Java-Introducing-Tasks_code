package by.jonline.task02.main;

public class Task_02_04 {

	public static void main(String[] args) {
		/*
		 * You are given real numbers a1, a2, ..., an. 
		 * Swap the largest and smallest items.
		 */
		
		int arrayDimension = 100; //Array dimension
		long maxNumber = 32000; // max number for array elements
		long minNumber = -32000; // min number for array elements
		
		double maxNumberInArray = 0;
		int indexMaxNumberInArray = 0;
		
		double minNumberInArray = 0;
		int indexMinNumberInArray = 0;
		
		
		double arrayA [] = new double[arrayDimension];
		
			
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = minNumber + (Math.random() *  (maxNumber - minNumber)); // fill the array
		}
		
		
		for (int j = 0; j<arrayDimension; j++) {
			
			if(arrayA[j] > maxNumberInArray) {
				
				maxNumberInArray = arrayA[j]; 
				indexMaxNumberInArray = j;
			}
			
			if(arrayA[j] < minNumberInArray) {
				
				minNumberInArray = arrayA[j]; 
				indexMinNumberInArray = j;
			}		
			
		}
		
		double temp =  arrayA[indexMaxNumberInArray]; // Assign the MaxNumber to the temporary variable.
		
		System.out.println("Maximum number = " + arrayA[indexMaxNumberInArray] + " with the index = " + indexMaxNumberInArray);
		System.out.println("Minimum number = " + arrayA[indexMinNumberInArray] + " with the index = " + indexMinNumberInArray);
		System.out.println("We are change them. Now...");
		
		arrayA[indexMaxNumberInArray] = arrayA[indexMinNumberInArray];
		arrayA[indexMinNumberInArray] = temp;
		
		System.out.println("Array member with index = " + indexMaxNumberInArray + " is " + arrayA[indexMaxNumberInArray]);
		System.out.println("Array member with index = " + indexMinNumberInArray + " is " + arrayA[indexMinNumberInArray]);
		

	}

}
