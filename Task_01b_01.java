package by.jonline.task01.main;

public class Task_01b_01 {

	public static void main(String[] args) {
		/*
		 * Some positive integer number is given.
		 * The program should sum up all values from 1 to this number.
		 */
		
		TaskHelper helper = new TaskHelper();
		
	    
		String strChar = helper.GetUserInput("Input positive integer number: ");
	    int x = Integer.parseInt(strChar);
	    
	    int z = 0;
	  
	    for (int n = 1; n <= x; n++) {
	    	z = z + n;
	    }
	    
	    System.out.println("The sum of all numbers is: " + z);
	}

}
