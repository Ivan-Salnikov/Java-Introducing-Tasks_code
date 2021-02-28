package by.jonline.task02.main;

public class Task_02a_11 {

	public static void main(String[] args) {
		/*
		 * Fill the 10x20 matrix with random numbers from 0 to 15. 
		 * Display the matrix itself and the row numbers, in which the number 5 occurs three or more times.
		 */
		
		//int n = 6; // given n
		
		int matrixDimensionX = 10; //Matrix width
		int matrixDimensionY = 20; //Matrix length
		
		int maxNumber = 15; // max number for array elements
		int minNumber = 0; // min number for array elements				
		
		int arrayA [][] = new int[matrixDimensionX][matrixDimensionY];
		
		int numberHits;
		String rowHits = "";
			
		for (int j = 0; j < matrixDimensionY; j++) {
			
			numberHits = 0;
			
			for (int i = 0; i < matrixDimensionX; i++) {
				arrayA[i][j] = minNumber + (int)(Math.random() *  (maxNumber - minNumber)); // fill the matrix	
				System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);
				
				if (arrayA[i][j] == 5) {
					numberHits++;
				}
				
			}
			
			if (numberHits >= 3) {
				if (rowHits == "") {
					rowHits = "" + j;
				} else {
					rowHits = rowHits + ", " + j;	
				}
				
			}
			
		}
		
		if (rowHits != "") {
			System.out.println("Row number which the number 5 occurs three or more times is " + rowHits);	
		} else
		{
			System.out.println("We have not rows which the number 5 occurs three or more times");
		}
		

	}

}
