package by.jonline.task02.main;

public class Task_02a_15 {

	public static void main(String[] args) {
		/*
		 * Find the largest element of the matrix and replace all odd elements with it.
		 */
		
		int m = 4; // given m
		int n = 5; // given n
		
		int matrixDimensionX = m; //Matrix width
		int matrixDimensionY = n; //Matrix length
		
		int maxNumber = 200; // max number for array elements
		int minNumber = -200; // min number for array elements			
		
		int maxElement = 0;
					
		
		int arrayA [][] = new int[matrixDimensionX][matrixDimensionY];
		
					
		for (int i = 0; i < matrixDimensionX; i++) {
			for (int j = 0; j < matrixDimensionY; j++) {
				
				arrayA[i][j] = minNumber + (int)(Math.random() *  (maxNumber - minNumber)); // fill the matrix	
				
				if (maxElement < arrayA[i][j]) {
					maxElement = arrayA[i][j];
				}
				
		//		System.out.println("arrayA[" + (int)(i+1) + "][" + (int)(j+1) + "] = " + arrayA[i][j]);					
			}
		}
		
		printMatrix (arrayA);
		
		System.out.println("Maximum elements of matrix is " + maxElement);
		System.out.println("Replaced all odd elements with maximum");

		// Change all odd elements with maximum
		for (int i = 0; i < matrixDimensionX; i++) {
			for (int j = 0; j < matrixDimensionY; j++) {
				
				if (arrayA[i][j] % 2 != 0) {
					arrayA[i][j] = maxElement;	
				}
				 	
				
				//System.out.println("arrayA[" + (int)(i+1) + "][" + (int)(j+1) + "] = " + arrayA[i][j]);					
			}
		}
		
		printMatrix (arrayA);
		
		
	}
	
	 //The printMatrix method is responsible for displaying the matrix on the screen
	   public static void printMatrix (int matrix[][]) {
	       for (int[] array : matrix) {
	           for (int x : array) {
	               System.out.print(x + "\t");
	           }
	           System.out.println();
	       }
	       System.out.println("");
	   }

}
