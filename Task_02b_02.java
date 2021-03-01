package by.jonline.task02.main;


public class Task_02b_02 {

	public static void main(String[] args) {
		/*
		 * Two sequences a1<=a2<=....an and b1<=b2<=b3<=...<=bn are given. 
		 * Form a new sequence of numbers from them so that it is also non-decreasing. 
		 * Do not use an additional array.
		 */
		
		
		int arrayA [] = new int[] {2, 15, 20, 42, 45, 89, 120, 500};
		int arrayB [] = new int[] {5, 6, 7, 8, 21, 42, 42, 79, 455, 625, 999, 1025};
				
		int arrayC [] = new int[arrayA.length + arrayB.length];
		
		int indexA = 0;
		int indexB = 0;
		
		
		for (int i = 0; i < arrayC.length; i++) {
			
			if (indexB >= arrayB.length) {
				arrayC[i] = arrayA[indexA];
				indexA++;
			} else {
				if (indexA >= arrayA.length) {
					arrayC[i] = arrayB[indexB];
					indexB++;
				} else {
					if (arrayA[indexA] < arrayB[indexB]) {
						arrayC[i] = arrayA[indexA];
						indexA++;
					} else {
						if (arrayA[indexA] > arrayB[indexB]) {
							arrayC[i] = arrayB[indexB];
							indexB++;	
						} else {
							
							arrayC[i] = arrayA[indexA];
							System.out.println("ArrayC[" + i + "] = " + arrayC [i]);					
							indexA++;
							i++;
							
							arrayC[i] = arrayB[indexB];
							indexB++;
						}
						
					}
				}
			
			}
			
			System.out.println("ArrayC[" + i + "] = " + arrayC [i]);
			
		}
		
		
		
		
		
	}

}