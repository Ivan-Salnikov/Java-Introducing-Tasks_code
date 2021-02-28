package by.jonline.task02.main;

public class Task_02a_07 {

	public static void main(String[] args) {
		/*
		 * Form a square matrix of order N according to the rule:
		 * A[I, J] = sin ((I*I - J*J) / N)
		 * 
		 * and count the number of positive elements in it
		 */

		int n = 6; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n; //Matrix length
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
		
		int countPositive = 0;
		double calcFunction;
			
		for (int i = 0; i < matrixDimensionX; i++) {
			
			for (int j = 0; j < matrixDimensionY; j++) {
				
				calcFunction =  (((i+1)*(i+1) - (j+1)*(j+1)) / (double) n);
				
				arrayA[i][j] = Math.sin(calcFunction);				
			
				if (arrayA[i][j] > 0) {
					countPositive++;
				}
				System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
					
			}		
		}
		System.out.println("Count of positive numbers is " + countPositive);
	}

}
