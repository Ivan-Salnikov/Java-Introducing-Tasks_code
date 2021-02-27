package by.jonline.task01.main;

public class Task_01_06 {

	/*
	 * Some area is given. We must determine if a particular point belongs to this area. Print "true", if it belongs, else - "false".
	 * There is two rectangle: 
	 * (-4,-3) - (4, 0)
	 * (-2, 0) - (2, 4)
	 */
	public static void main(String[] args) {
		// 
		
		TaskHelper helper = new TaskHelper();
	    
		String strChar = helper.GetUserInput("Input X: ");
	    double xPos = Double.parseDouble(strChar);
	    
	    strChar = helper.GetUserInput("Input Y: ");
	    double yPos = Double.parseDouble(strChar);
	    
	    if (((yPos >= 0) & (yPos <=4) & (xPos >= - 2) & (xPos <=2)) || /*first rectangle*/
	    		((yPos >= -3) & (yPos <=0) & (xPos >= - 4) & (xPos <=4))) {  /*second rectangle*/
	    	System.out.println("true");
	    }
	    else {
	    	System.out.println("false");
	    }

	}

}
