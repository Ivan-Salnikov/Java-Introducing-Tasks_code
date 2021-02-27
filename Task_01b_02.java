package by.jonline.task01.main;

public class Task_01b_02 {
	
	public static void main(String[] args) {
	/*
	 * It is necessary to calculate the value of the function on the segment with step h.
	 */
	
	TaskHelper helper = new TaskHelper();
	
    
	String strChar = helper.GetUserInput("Input a: ");
    int a = Integer.parseInt(strChar);
    
    strChar = helper.GetUserInput("Input b: ");
    int b = Integer.parseInt(strChar);
    
    strChar = helper.GetUserInput("Input step h: ");
    int h = Integer.parseInt(strChar);
  
    for (int n = a; n <= b; n = n + h) {
    	if (n > 2) {
    		System.out.println("y= " + n);		
    	}
    	else {
    		System.out.println("y= -" + n);
    	}
    }
    
	}
    
}
