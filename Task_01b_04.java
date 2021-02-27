package by.jonline.task01.main;

import java.math.*;

public class Task_01b_04 {

	public static void main(String[] args) {
		/*
		 * It is necessary to calculate the composition of squares of the first two hundred numbers.
		 */
		
	    int x = 200;
	    
	    BigInteger z = BigInteger.valueOf(1);
	  
	    for (int n = 1; n <= x; n++) {

	    	z = z.multiply(BigInteger.valueOf(n * n) );
	    	
	    	}
	    System.out.println("Expression = " + z);   

	}

}
