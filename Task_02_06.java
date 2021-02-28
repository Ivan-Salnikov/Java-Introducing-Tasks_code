package by.jonline.task02.main;

public class Task_02_06 {

	public static void main(String[] args) {
		/*
		 * A sequence of N real numbers is given. 
		 * Calculate the sum of the numbers whose ordinal numbers are prime numbers.
		 */
		
		int arrayDimension = 100; //Array dimension
		long maxNumber = 32000; // max number for array elements
		long minNumber = -32000; // min number for array elements				
		
		double arrayA [] = new double[arrayDimension];
		
		double sumMembers = 0;
		
		boolean isPrime;
		
			
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = minNumber + (Math.random() *  (maxNumber - minNumber)); // fill the array
		}
		
		
		for (int j = 0; j<arrayDimension; j++) {
			
			isPrime = true;
			
			for (int z = 2; z <= Math.sqrt((double)j); z++ ) {
				if (j % z == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime) {
				sumMembers	 = sumMembers + arrayA[j];
				//System.out.println("Number " + j + " is prime ");
			}
			
		}
		
		System.out.println("Sum of members of sequence with prime ordinal numbers is " + sumMembers );
		
	}

}
