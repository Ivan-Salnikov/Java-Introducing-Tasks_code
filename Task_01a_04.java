package by.jonline.task01.main;

public class Task_01a_04 {

	public static void main(String[] args) {
		/*
		 * There is two dimensions of the rectangle hole (A and B) and dimension of the brick (x, y, z). 
		 * We must determine does this brick can put in this hole.
		 * 
		 */
		
		TaskHelper helper = new TaskHelper();
		
	    
		String strChar = helper.GetUserInput("Input hole dimension A: ");
	    double aHole = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input hole dimension B: ");
	    double bHole = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input brick dimension x: ");
	    double x = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input brick dimension y: ");
	    double y = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input brick dimension z: ");
	    double z = Double.parseDouble(strChar);
	  
	        
	    if ((x < aHole & y < bHole) || (y < aHole & x < bHole) ||
	    		(y < aHole & z < bHole) || (z < aHole & y < bHole) ||
	    		(x < aHole & z < bHole) || (z < aHole & x < bHole)) {
	    	
	    	System.out.println("The brick can be placed on this hole.");	
	    }
	    else {
	    	System.out.println("The brick can NOT be placed on this hole.");
	    }
	}

}
