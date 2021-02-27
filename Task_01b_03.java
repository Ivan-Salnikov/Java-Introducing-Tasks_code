package by.jonline.task01.main;

public class Task_01b_03 {

	public static void main(String[] args) {
		/*
		 * It is necessary to calculate the sum of squares of the first one hundred numbers.
		 */
		
	    int x = 100;
	    int z = 0;
	  
	    for (int n = 1; n <= x; n++) {
	    	z = z + n*n;
	    	}
	    System.out.println("Expression = " + z);   
	}

}
