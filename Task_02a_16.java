package by.jonline.task02.main;

public class Task_02a_16 {

	public static void main(String[] args) {
		/*
		 * A magic square of order n is an n x n square matrix composed of the numbers 1, 2, 3, ..., n*n, 
		 * so that the sums for each column, each row, and each of the two large diagonals are equal between yourself. 
		 * Construct such a square.
		 * !!!!!!
		 * Since it is not written which dimension of the magic square needs to be built,  
		 * I took the liberty of limiting the task condition. 
		 * (Only (!) odd number dimension of the magic square) 
		 */
		
		int n = 3; // given n (Only (!)odd number) 
		
		int matrixDimensionX = n; //Matrix width
		int matrixDimensionY = n; //Matrix length					
		
		int arrayA [][] = new int[matrixDimensionX][matrixDimensionY];
		
		int number = 1;
	    int row = 0;
	    int column = n / 2;
	    int curr_row;
	    int curr_col;
	    while (number <= n * n) {
	    	arrayA[row][column] = number;
	        number++;
	        curr_row = row;
	        curr_col = column;
	        row -= 1;
	        column += 1;
	        if (row == -1) {
	            row = n - 1;
	        }
	        if (column == n) {
	            column = 0;
	        }
	        if (arrayA[row][column] != 0) {
	            row = curr_row + 1;
	            column = curr_col;
	            if (row == -1) {
	                row = n - 1;
	            }
	        }
	    }
	       
		
		printMatrix (arrayA);
		
				
		
	}
	
	 //The printMatrix method is responsible for displaying the matrix on the screen
	   public static void printMatrix (int matrix[][]) {
	       for (int[] array : matrix) {
	           for (int x : array) {
	               System.out.print(x + "\t");
	           }
	           System.out.println();
	       }
	       System.out.println("");
	   }

}
