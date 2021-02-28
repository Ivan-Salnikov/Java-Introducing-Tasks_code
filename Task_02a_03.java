package by.jonline.task02.main;

public class Task_02a_03 {

	public static void main(String[] args) {
		/*
		 * A matrix is given. 
		 * Print the k-th row and p-th column of the matrix.
		 */
		
		int matrixDimensionX = 10; //Matrix width
		int matrixDimensionY = 10; //Matrix length
		long maxNumber = 200; // max number for array elements
		long minNumber = -200; // min number for array elements			
		
		int k = 5; // num of row
		int p = 7; // num of column
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
		
			
		for (int i = 0; i < matrixDimensionX; i++) {
			for (int j = 0; j < matrixDimensionY; j++) {
				arrayA[i][j] = minNumber + (Math.random() *  (maxNumber - minNumber)); // fill the matrix	
			}		
		}
		
		System.out.println("Row[" + k + "] is "); 
		for (int i = 0; i < matrixDimensionX; i++) {
			System.out.println("" + arrayA[i][k-1]);
		}
		
		System.out.println("Column[" + p + "] is ");
		for (int j = 0; j < matrixDimensionY; j++) {
			System.out.println("" + arrayA[p-1][j]);	
		}
	}

}
