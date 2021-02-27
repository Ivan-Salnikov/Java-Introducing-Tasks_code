package by.jonline.task01.main;

public class Task_01a_01 {

	/*
	 * Two angles of some triangle are given. We must determine if this triangle exists. And whether it is a right-angled triangle.
	 */
	public static void main(String[] args) {
		// 
		
		TaskHelper helper = new TaskHelper();
	    
		String strChar = helper.GetUserInput("Input first angle: ");
	    double xAngle = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input second angle: ");
	    double yAngle = Double.parseDouble(strChar);
	    
	    if ((xAngle + yAngle) < 180) {
	    	System.out.println("The triangle exists.");
	    	if ((xAngle + yAngle) == 90 ) {
	    		System.out.println("This is right-angled triangle.");
	    	}
	    	else {
	    		System.out.println("This is NOT right-angled triangle.");
	    	}
	    }
	    else {
	    	System.out.println("The triangle with such angles does not exists.");
	    }

	}
	
}
