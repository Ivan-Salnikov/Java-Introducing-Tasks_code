package by.jonline.task02.main;

public class Task_02a_10 {

	public static void main(String[] args) {
		/*
		 * Find the positive elements of the main diagonal of a square matrix
		 */
		
		int n = 6; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n; //Matrix length
		
		long maxNumber = 200; // max number for array elements
		long minNumber = -200; // min number for array elements				
		
		double arrayA [][] = new double[matrixDimensionX][matrixDimensionY];
			
		for (int i = 0; i < matrixDimensionX; i++) {
			
			for (int j = 0; j < matrixDimensionY; j++) {
				arrayA[i][j] = minNumber + (Math.random() *  (maxNumber - minNumber)); // fill the matrix	
				System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
				
				if ((i ==j) && arrayA[i][j] > 0 ) {
					System.out.println("Positive elements[" + i + "][" + j + "] = " + arrayA[i][j]);
				}
			}		
			
		}
		
		

	}

}
