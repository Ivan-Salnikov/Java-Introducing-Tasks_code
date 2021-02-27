package by.jonline.task01.main;

public class Task_01b_08 {

	public static void main(String[] args) {
		/*
		 * There are two numbers m and n . Determine the numbers that are included in
		 * the recording of both numbers.
		 */

		TaskHelper helper = new TaskHelper();

		String strCharM = helper.GetUserInput("Input m: ");
		String strCharN = helper.GetUserInput("Input n: ");

		String equalDigits = "";

		for (int i = 0; i <= 9; i++) {

			if ((strCharM.indexOf(Integer.toString(i)) >= 0) & (strCharN.indexOf(Integer.toString(i))) >= 0) {
				equalDigits = equalDigits + " " + Integer.toString(i);
			}

		}

		System.out.println("Equal digits is: " + equalDigits);

	}

}
