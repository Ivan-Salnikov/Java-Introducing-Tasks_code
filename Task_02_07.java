package by.jonline.task02.main;

public class Task_02_07 {

	public static void main(String[] args) {
		/*
		 * Sequence of real numbers are given a_1, a_2, a_3, .... a_2n
		 * Need to find max (a_1 + a_2n, a_2 + a_(2n-1), a_n + a_(n+1)
		 */

		int arrayDimension = 100; //Array dimension
		long maxNumber = 32000; // max number for array elements
		long minNumber = -32000; // min number for array elements				
		
		double arrayA [] = new double[arrayDimension];
		
		double maxNumberOfNewSequence = 0;
		
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = minNumber + (Math.random() *  (maxNumber - minNumber)); // fill the array
			//System.out.println("arrayA[" + i + "] = " + arrayA[i]);
		}
		
		double arrayB [] = new double[arrayDimension/2];
		
		for (int j = 0; j < arrayB.length; j++) {
			arrayB[j] = arrayA[j] + arrayA[arrayDimension - j - 1];
			
			if (maxNumberOfNewSequence < arrayB[j]) {
				maxNumberOfNewSequence = arrayB[j];
			}
		}
		
		System.out.println("The max number of new sequence is " + maxNumberOfNewSequence);
	}

}
