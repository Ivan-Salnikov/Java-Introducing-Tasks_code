package by.jonline.task01.main;

public class Task_01b_06 {

	public static void main(String[] args) {
		/*
		 * It is necessary to display a correspondence table between symbols and their codes.
		 */
		char c;
		
		for (int n = 32; n <= 127; n++) {
			
			c = (char)n;
			
			System.out.print("Symbol (");
			System.out.print(c);
			System.out.print(") has code ");
			System.out.println(" = " + n);	
		}
		
	}

}
