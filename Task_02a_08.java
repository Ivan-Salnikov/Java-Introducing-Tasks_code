package by.jonline.task02.main;

import by.jonline.task01.main.TaskHelper;

public class Task_02a_08 {

	public static void main(String[] args) {
		/*
		 * In a numeric matrix, swap two columns of any column, 
		 * i.e. put all elements of one column to the corresponding positions of the other, and move its elements of the second to the first. 
		 * Column numbers introduces user from keyboard.
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
			}		
		}
		
		TaskHelper helper = new TaskHelper();

		String strCharM = helper.GetUserInput("Input first number of column to swap: ");
		int firstSwapColumn = Integer.parseInt(strCharM) - 1; // given firstSwapColumn
		
		strCharM = helper.GetUserInput("Input second number of column to swap: ");
		int secondSwapColumn = Integer.parseInt(strCharM) - 1; // given secondSwapColumn
		
		double temp = 0;
		
		for (int j = 0; j < matrixDimensionY; j++) {
			temp = arrayA[firstSwapColumn][j];
			arrayA[firstSwapColumn][j] = arrayA[secondSwapColumn][j];
			arrayA[secondSwapColumn][j] = temp;
			System.out.println("arrayA[" + firstSwapColumn + "][" + j + "] = " + arrayA[firstSwapColumn][j] + "    arrayA[" + secondSwapColumn + "][" + j + "] = " + arrayA[secondSwapColumn][j]);
		}
		
	}

}
