package by.jonline.task01.main;

public class Task_01a_05 {

	public static void main(String[] args) {
		/*
		 * X is given. It is necessary to calculate the value of the function.
		 * if x <= 3 then f(x) = x*x - 3x  + 9
		 * if x > 3 then f(x) = 1 / (x*x*x + 6)
		 * 
		 */
		
		TaskHelper helper = new TaskHelper();
		
	    
		String strChar = helper.GetUserInput("Input X: ");
	    double x = Double.parseDouble(strChar);
	  
	    if (x <= 3) {	    	
	    	double z = x*x - 3*x + 9;
	    	System.out.println("The f(x) = " + z);	
	    }
	    else {
	    	double z = 1 / (Math.pow(x, 3) + 6);
	    	System.out.println("The f(x) = " + z);
	    }
	}

}
