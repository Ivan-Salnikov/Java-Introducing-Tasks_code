package by.jonline.task02.main;

public class Task_02a_05 {

	public static void main(String[] args) {
		/*
		 * Form a square matrix of order n according to a given pattern (n is even):
		 * (1, 1, 1, ....1, 1, 1)
		 * (2, 2, 2, ....2, 2, 0)
		 * (3, 3, 3, ....3, 0, 0)
		 * (., ., ., ....., ., .)
		 * (n-1, n-1, 0, ....0, 0, 0)
		 * (n, 0, 0, ....0, 0, 0)
		 */

		int n = 9; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n; //Matrix length
		
		int maxNotZero;
					
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
		
			
		for (int i = 0; i < matrixDimensionX; i++) {

			maxNotZero = matrixDimensionY - i;
			
			for (int j = 0; j < matrixDimensionY; j++) {
				
				if (j < maxNotZero) {
					arrayA[i][j] = j + 1;	
				} else {
					arrayA[i][j] = 0;	
				}
			
			System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
					
			}		
		}
	}

}
