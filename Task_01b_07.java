package by.jonline.task01.main;

public class Task_01b_07 {

	public static void main(String[] args) {
		/* There are two numbers (m, n) that define the segment. 
		 * For all numbers from this segment, it is necessary to find all divisors, except for one and the number itself.
		*/
		
		TaskHelper helper = new TaskHelper();
		
	    
		String strChar = helper.GetUserInput("Input m: ");
	    int m = Integer.parseInt(strChar);
	    
	    strChar = helper.GetUserInput("Input n: ");
	    int n = Integer.parseInt(strChar);
	    Boolean haveDivisors;
	    	    
	    for (int i = m; i <= n; i++) {
	    	
	    	haveDivisors = false;
	    	
	    	
	    	
	    	for (int j=2; j < i; j++) {
	    		
	    		if (i % j == 0) {
	    			
	    			if (haveDivisors == false) System.out.print("Divisors of " + i + " is: ");
	    			
	    			System.out.print(" " + j);
	    			haveDivisors = true;
	    		}
	    			    		
	    	}
	    	
	    	if (haveDivisors) {
	    		System.out.println("");
	    	}

	    }
	    
	       
	}

}
