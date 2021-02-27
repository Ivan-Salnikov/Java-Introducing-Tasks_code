package by.jonline.task01.main;

public class Task_01a_03 {
	
	/*
	 * There is coordinates of the three points (x1, y1), (x2, y2), (x3, y3). 
	 * We must determine if this points is placed on the same line.
	 * (x - x_1) / (x_2 - x1) = (y - y_1) / (y_2 - y_1)
	 */
	public static void main(String[] args) {
		// 
		
		TaskHelper helper = new TaskHelper();
		
		double Tolerance = 1e-10;
	    
		String strChar = helper.GetUserInput("Input x1: ");
	    double x1 = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input y1: ");
	    double y1 = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input x2: ");
	    double x2 = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input y2: ");
	    double y2 = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input x3: ");
	    double x3 = Double.parseDouble(strChar);
	  
	    strChar = helper.GetUserInput("Input y3: ");
	    double y3 = Double.parseDouble(strChar);
	    
	    if (Math.abs((x3 - x1) / (x2 - x1) - (y3 - y1) / (y2 - y1)) < Tolerance) {
	    	System.out.println("Points are placed on the same line.");	
	    }
	    else {
	    	System.out.println("Points are NOT placed on the same line.");
	    }
	    
	}    

}
