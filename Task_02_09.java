package by.jonline.task02.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_02_09 {

	public static void main(String[] args) {
		/*
		 * Find the most frequent number in an array of integers with n elements. 
		 * If such there are several numbers, then determine the smallest of them.
		 */
		
		int arrayDimension = 100; //Array dimension
		long maxNumber = 20; // max number for array elements
		long minNumber = -20; // min number for array elements				
		
		
		ArrayList<Long> myList = new ArrayList<>();
		
		for (int i = 0; i < arrayDimension; i++) {
			myList.add((long)(minNumber + (int) (Math.random() *  (maxNumber - minNumber)))); // fill the array
			
		}

		Map<Long, Long> counts = new HashMap<Long, Long>();
		
		for (Long lng : myList) {
			if (counts.containsKey(lng)) {
				counts.put(lng, counts.get(lng) + 1);
			} else {
				counts.put(lng, (long) 1);
			}
			
		}
		
		long maxCountFrequence = 1;
		
		System.out.println("Initial Mappings are: " + counts);
		
		for (Map.Entry<Long, Long> entry : counts.entrySet()) { // find most frequence
		    
		    if (maxCountFrequence < entry.getValue()) {
		    	maxCountFrequence = entry.getValue();
		    }
		    
	    
		}
		
		System.out.println("Max frequence is " + maxCountFrequence);
		
				
		long minMostFrequenceNumber = 0;
		
		for (Map.Entry<Long, Long> entry : counts.entrySet()) {
		    
		    if (maxCountFrequence == entry.getValue()) {
		    	
		    	System.out.println("Number with most frequence number is " + entry.getKey());
		    	
		    	if (minMostFrequenceNumber > entry.getKey()) {
		    		minMostFrequenceNumber = entry.getKey();
		    	}
		    	
		    }
		    
	    
		}
		
		    
		System.out.println("Minimum most frequence number is " + minMostFrequenceNumber);
		    
	    
		
		
	}

}
