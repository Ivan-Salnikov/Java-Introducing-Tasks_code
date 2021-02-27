package by.jonline.task01.main;

public class Task_01a_02 {

	/*
	 * max {min(a,b), min(c,d)}.
	 */
	public static void main(String[] args) {
		// 
		
		TaskHelper helper = new TaskHelper();
	    
		String strChar = helper.GetUserInput("Input a: ");
	    double a = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input b: ");
	    double b = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input c: ");
	    double c = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input d: ");
	    double d = Double.parseDouble(strChar);
	    
	    double z = Math.max(Math.min(a, b), Math.min(c, d));
	    
	    System.out.println("Expression is: " + z);
	    

	}
	
}
