package by.jonline.task02.main;
import java.util.*;


public class Task_02_08 {

	public static void main(String[] args) {
		/*
		 * Given a sequence of integers a1, a2,..., an
		 * Form a new sequence by throwing out the original are those terms that are equal min(a1, a2,..., an)
		 */
		
		int arrayDimension = 100; //Array dimension
		long maxNumber = 20; // max number for array elements
		long minNumber = -20; // min number for array elements				
		
		long minNumberofArrayList = maxNumber;
		
		ArrayList<Long> myList = new ArrayList<>();
		
		for (int i = 0; i < arrayDimension; i++) {
			myList.add((long)(minNumber + (int) (Math.random() *  (maxNumber - minNumber)))); // fill the array
			
			System.out.println("myList " + i + " is " + myList.get(i));
			
			if (minNumberofArrayList > (long) myList.get(i)) {
				minNumberofArrayList = (long) myList.get(i);				
			}
		}
		
		System.out.println("");
		System.out.println("minNumber is " + minNumberofArrayList);
		System.out.println("");
		
		for (int j = 0; j < arrayDimension; j++) {
			if (myList.get(j) == minNumberofArrayList) {
				
				myList.remove(j);
				arrayDimension--;
				j--;

			} else {
				System.out.println("myList " + j + " is " + myList.get(j));				
			}

		}


	}

}

