package by.jonline.task01.main;

public class Task_01b_05 {

	public static void main(String[] args) {
		/* Given a number series and some number e.
		 * It is necessary to find the sum of the members of the series whose modulus is greater than the number e.
		 *  An = 1/pow(2,n) + 1/pow(3,n) 
		*/
		
		TaskHelper helper = new TaskHelper();
		
	    
		String strChar = helper.GetUserInput("Input e: ");
	    double e = Double.parseDouble(strChar);
	    double sumMembers = 0;
	    
	    double a_n = (double) 1/2 + (double) 1/3;
	    int n = 1;
	    
	    while (Math.abs(a_n) > e) {
	    	
	    	sumMembers += a_n;
	    	System.out.println("a_" + n + "= " + a_n);

	    	n++;
	    	a_n = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
	    	
	    	   	
	    }
	    System.out.println("Sum of members is: " + sumMembers);   
	}

}
