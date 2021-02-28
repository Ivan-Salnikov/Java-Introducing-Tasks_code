package by.jonline.task02.main;

public class Task_02a_14 {

	public static void main(String[] args) {
		/*
		 * Generate a random m x n matrix consisting of zeros and ones, 
		 * and in each column the number of ones is equal to the column number
		 */

		int m = 8; // given m
		int n = 10; // given n
		
		int matrixDimensionX = m; //Matrix width
		int matrixDimensionY = n; //Matrix length
		
		int quantityOnes = 0; // Quantity of ones in the column
		
		int temp = 0;
					
		
		int arrayA [][] = new int[matrixDimensionX][matrixDimensionY];
		
					
		for (int i = 0; i < matrixDimensionX; i++) {
			
			quantityOnes = 0;
			
			System.out.println("");
			
			for (int j = 0; j < matrixDimensionY; j++) {
				
				temp = (int) Math.round(Math.random());
				
				if (temp == 1) {
					
					if ((quantityOnes < i + 1)) {
						arrayA[i][j] = 1;
						quantityOnes++;
					} else {
						arrayA[i][j] = 0;
					}
				
				} else {
					
					if ((matrixDimensionY - (j+1)) < (i+1 - quantityOnes)) {
						arrayA[i][j] = 1;
						quantityOnes++;
					} else {
						arrayA[i][j] = 0;
					}
				}
				
				System.out.println("arrayA[" + (int)(i+1) + "][" + (int)(j+1) + "] = " + arrayA[i][j]);					
			}
		}
		
	}

}
