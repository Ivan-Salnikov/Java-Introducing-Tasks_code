package by.jonline.task02.main;

public class Task_02a_09 {

	public static void main(String[] args) {
		/*
		 * A matrix of non-negative numbers is given. 
		 * Calculate the sum of the items in each column. 
		 * Determine which the column contains the maximum amount.
		 */

		int n = 6; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n; //Matrix length
		
		long maxNumber = 200; // max number for array elements
		long minNumber = 0; // min number for array elements				
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
		
		double sumColumn = 0;
		double maxSumColumn = 0;
		int indexOfMaxsumColumn = 0;
		
			
		for (int i = 0; i < matrixDimensionX; i++) {
			
			sumColumn = 0;
			
			for (int j = 0; j < matrixDimensionY; j++) {
				arrayA[i][j] = minNumber + (Math.random() *  (maxNumber - minNumber)); // fill the matrix	
				//System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
				sumColumn = sumColumn + arrayA[i][j];
			}		
			System.out.println("Sum elements of column[" + i + "] = " + sumColumn);
			
			if (maxSumColumn < sumColumn) {
				maxSumColumn = sumColumn;
				indexOfMaxsumColumn = i;
			}
		}
		
		System.out.println("Maximum sum of elements has column[" + indexOfMaxsumColumn + "] with the sum is " + maxSumColumn);
		
	}

}
