package by.jonline.task02.main;

public class Task_02a_13 {

	public static void main(String[] args) {
		/*
		 * Sort matrix columns in ascending and descending order of element values.
		 */
		
		
		int n = 6; // given n
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n+2; //Matrix length
		
		int maxNumber = 200; // max number for array elements
		int minNumber = -200; // min number for array elements				
		
		int arrayA [][] = new int[matrixDimensionX][matrixDimensionY];
		
					
		for (int j = 0; j < matrixDimensionX; j++) {			
			
			System.out.println ("Column [" + j + "] before ordering is ");
			for (int i = 0; i < matrixDimensionY; i++) {
				arrayA[j][i] = minNumber + (int)(Math.random() *  (maxNumber - minNumber)); // fill the matrix	
				System.out.println("arrayA[" + j + "][" + i + "] = " + arrayA[j][i]);					
			}
			
			
			// Start sort rows ascending order
			for (int i = arrayA[0].length - 1; i>0; i--) {
				 for(int z = 0 ; z < i ; z++){
					 
					 /*Compare the elements in pairs, if they are in the wrong order, then swap them*/			
					 if( arrayA[j][z] > arrayA[j][z+1] ){
		                    int tmp = arrayA[j][z];
		                    arrayA[j][z] = arrayA[j][z+1];
		                    arrayA[j][z+1] = tmp;
		                }
				 }
			 
									
			}
			
			System.out.println ("Column [" + j + "] after ascending ordering is ");
			for (int i = 0; i < matrixDimensionY; i++) {
				System.out.println("arrayA[" + j + "][" + i + "] = " + arrayA[j][i]);					
			}
			// End sort columns ascending order
			
			// Start sort columns descending order
			for (int i = arrayA[0].length - 1; i>0; i--) {
				 for(int z = 0 ; z < i ; z++){
					 
					 /*Compare the elements in pairs, if they are in the wrong order, then swap them*/			
					 if( arrayA[j][z] < arrayA[j][z+1] ){
		                    int tmp = arrayA[j][z];
		                    arrayA[j][z] = arrayA[j][z+1];
		                    arrayA[j][z+1] = tmp;
		                }
				 }
			 
									
			}
			
			System.out.println ("Column [" + j + "] after descenging ordering is ");
			for (int i = 0; i < matrixDimensionY; i++) {
				System.out.println("arrayA[" + j + "][" + i + "] = " + arrayA[j][i]);					
			}
			// End sort rows descending order
			
			
			System.out.println (" ");
		}
		
		

		
	}

}
