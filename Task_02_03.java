package by.jonline.task02.main;


public class Task_02_03 {
	/*
	 * An array of real numbers is given, the dimension of which is N. 
	 * Calculate how many negative numbers there are in it, positive and zero elements.
	 */
	public static void main(String[] args) {
		

		int arrayDimension = 100; //Array dimension
		long maxNumber = 32000; // max number for array elements
		long minNumber = -32000; // min number for array elements
		
		long countPositive = 0;
		long countZero = 0;
		long countNegative = 0;
		
		
		double arrayA [] = new double[arrayDimension];
		
			
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = minNumber + (Math.random() *  (maxNumber-minNumber)); // fill the array
		}
		
		for (int j = 0; j<arrayDimension; j++) {
			
			switch ((arrayA[j] < 0) ? -1 : 
					(arrayA[j] > 0) ? 1 :
						0) {
				case 0:
					countZero++;
					break;
				case 1:
					countPositive++;
					break;
				case -1:
					countNegative++;
					break;
			}		
			
		}
		System.out.println("Count of negative numbers is: " + countNegative);
		System.out.println("Count of positive numbers is: " + countPositive);
		System.out.println("Count of zero numbers is: " + countZero);
	}
}
