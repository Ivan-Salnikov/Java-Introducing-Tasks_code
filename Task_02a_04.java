package by.jonline.task02.main;

public class Task_02a_04 {

	public static void main(String[] args) {
		/*
		 * Form a square matrix of order n according to a given pattern (n is even):
		 * (1, 2, 3,...n)
		 * (n, n-1, n-2,...1)
		 * (1, 2, 3,...n)
		 * (n, n-1, n-2,...1)
		 *....
		 * (n, n-1, n-2,...1)
		 */

		int n = 6; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n; //Matrix length
					
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
		
			
		for (int i = 0; i < matrixDimensionX; i++) {
			for (int j = 0; j < matrixDimensionY; j++) {
				if (j % 2 ==0) {
					arrayA[i][j] = i+1;	
				} else {
					arrayA[i][j] = matrixDimensionY - i;
				}
			
			System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
					
			}		
		}
		
		
	}

}
