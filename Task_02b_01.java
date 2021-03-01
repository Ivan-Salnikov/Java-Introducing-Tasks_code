package by.jonline.task02.main;


public class Task_02b_01 {

	public static void main(String[] args) {
		/*
		 * Two one-dimensional arrays with different number of elements and a natural number k are given. 
		 * Combine them into one array, including the second array between the k-th and (k + 1) - th elements of the first, 
		 * without using an additional array.
		 */
		
		
		int arrayDimensionA = 8; //Array dimension
		int arrayDimensionB = 6; //Array dimension
		long maxNumber = 2000; // max number for array elements
		
		
		int arrayA [] = new int[arrayDimensionA];
		int arrayB [] = new int[arrayDimensionB];
		
		
		
		TaskHelper helper = new TaskHelper();
		String strCharM = helper.GetUserInput("Input k: ");
		
		int k = Integer.parseInt(strCharM); // given k
		
		for (int i = 0; i < arrayDimensionA; i++) {
			arrayA[i] = (int) (Math.random() *  maxNumber); // fill the array A
			System.out.println("ArrayA[" + i + "] = " + (int)arrayA [i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < arrayDimensionB; i++) {
			arrayB[i] = (int) (Math.random() *  maxNumber); // fill the array B
			System.out.println("ArrayB[" + i + "] = " + (int)arrayB [i]);
		}
		
		int arrayDimensionC = arrayDimensionA + arrayDimensionB; //Array dimension
		int arrayC [] = new int[arrayDimensionC];
		
				
		System.out.println("");
		
		for (int i = 0; i < arrayDimensionC; i++) {
			if (i <= k-1) {
				arrayC [i] = arrayA [i]; 
			} else {
				if (i < (k + arrayDimensionB)) {
					arrayC [i] = arrayB [i - k];
				} else {
					arrayC [i] = arrayA [i - arrayDimensionB];
				}
			}
			System.out.println("ArrayC[" + i + "] = " + (int)arrayC [i]);
		}
		
		
		
	}

}