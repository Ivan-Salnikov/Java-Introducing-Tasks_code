package by.jonline.task02.main;

public class Task_02a_06 {

	public static void main(String[] args) {
		/*
		 * Form a square matrix of order n according to a given pattern (n is even):
		 * (1, 1, 1, ....1, 1, 1)
		 * (0, 1, 1, ....1, 1, 0)
		 * (0, 0, 1, ....1, 0, 0)
		 * (., ., ., ....., ., .)
		 * (0, 1, 1, ....1, 1, 0)
		 * (1, 1, 1, ....1, 1, 1)
		 */

		int n = 6; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n; //Matrix length
		
		int maxNotZero;
		int minNotZero;
		int halfMatrixDimension = (int) (matrixDimensionX / 2); 
					
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
		
			
		for (int i = 0; i < matrixDimensionX; i++) {

			minNotZero = i;
			maxNotZero = matrixDimensionY - i - 1;
			
			System.out.println("");
			
			for (int j = 0; j < matrixDimensionY; j++) {
				
				if (i <= halfMatrixDimension) {
					if ((j <= minNotZero) || (j >= maxNotZero)) {
						arrayA[i][j] = 1;	
					} else {
						arrayA[i][j] = 0;	
					}	
				} else {
					if ((j >= minNotZero) || (j <= maxNotZero)) {
						arrayA[i][j] = 1;	
					} else {
						arrayA[i][j] = 0;	
					}
				}
					
				
			
			System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
					
			}		
		}
		
	}

}
