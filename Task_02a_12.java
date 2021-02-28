package by.jonline.task02.main;

public class Task_02a_12 {

	public static void main(String[] args) {
		/*
		 * Sort matrix rows in ascending and descending order of element values.
		 */
		
		
		int n = 6; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n+2; //Matrix length
		
		int maxNumber = 200; // max number for array elements
		int minNumber = -200; // min number for array elements				
		
		int arrayA [][] = new int[matrixDimensionX][matrixDimensionY];
		
					
		for (int j = 0; j < matrixDimensionY; j++) {			
			
			System.out.println ("Row [" + j + "] before ordering is ");
			for (int i = 0; i < matrixDimensionX; i++) {
				arrayA[i][j] = minNumber + (int)(Math.random() *  (maxNumber - minNumber)); // fill the matrix	
				System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);					
			}
			//System.out.println ("" + arrayA.length);
			
			// Start sort rows ascending order
			for (int i = arrayA.length - 1; i>0; i--) {
				 for(int z = 0 ; z < i ; z++){
					 
					 /*Compare the elements in pairs, if they are in the wrong order, then swap them*/			
					 if( arrayA[z][j] > arrayA[z+1][j] ){
		                    int tmp = arrayA[z][j];
		                    arrayA[z][j] = arrayA[z+1][j];
		                    arrayA[z+1][j] = tmp;
		                }
				 }
			 
									
			}
			
			System.out.println ("Row [" + j + "] after ascending ordering is ");
			for (int i = 0; i < matrixDimensionX; i++) {
				System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);					
			}
			// End sort rows ascending order
			
			// Start sort rows descending order
			for (int i = arrayA.length - 1; i>0; i--) {
				 for(int z = 0 ; z < i ; z++){
					 
					 /*Compare the elements in pairs, if they are in the wrong order, then swap them*/			
					 if( arrayA[z][j] < arrayA[z+1][j] ){
		                    int tmp = arrayA[z][j];
		                    arrayA[z][j] = arrayA[z+1][j];
		                    arrayA[z+1][j] = tmp;
		                }
				 }
			 
									
			}
			
			System.out.println ("Row [" + j + "] after descenging ordering is ");
			for (int i = 0; i < matrixDimensionX; i++) {
				System.out.println("arrayA[" + i + "][" + j + "] = " + arrayA[i][j]);					
			}
			// End sort rows descending order
			
			
			System.out.println (" ");
		}
		
		

		
	}

}
