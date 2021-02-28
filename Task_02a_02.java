package by.jonline.task02.main;

public class Task_02a_02 {

	public static void main(String[] args) {
		/*
		 * You are given a square matrix. 
		 * Display the elements on the diagonal.
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
			System.out.println("arrayA[" + i + "][" + i + "] = " + arrayA[i][i]); 	
				
		}
		
	}

}
