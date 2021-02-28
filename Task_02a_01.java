package by.jonline.task02.main;

public class Task_02a_01 {

	public static void main(String[] args) {
		/*
		 * A matrix is given. 
		 * Display all odd columns with the first item greater than the last.
		 */

		int matrixDimensionX = 10; //Matrix width
		int matrixDimensionY = 10; //Matrix length
		long maxNumber = 200; // max number for array elements
		long minNumber = -200; // min number for array elements				
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
		
			
		for (int i = 0; i < matrixDimensionX; i++) {
			for (int j = 0; j < matrixDimensionY; j++) {
				arrayA[i][j] = minNumber + (Math.random() *  (maxNumber - minNumber)); // fill the matrix	
			}		
		}
		
		
		for (int i = 0; i < matrixDimensionX; i++) {
			
			if ((i % 2 != 0) && (arrayA[i][0] > arrayA[i][matrixDimensionY - 1])) {
								
				for (int j = 0; j < matrixDimensionY; j++) {
					System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
				}
			}
			
		}
		
	}

}
