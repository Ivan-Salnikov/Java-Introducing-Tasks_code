package by.jonline.task02.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaskHelper {
    public String GetUserInput (String prompt) {
        String inputLine = null;
        System.out.print(prompt + "  ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException:  " + e);
        }
        return inputLine;

    }
    
    public static void bubbleSort(int[] arr){
        /*The outer loop shortens the fragment of the array each time, since the inner loop each time puts the maximum element at the end of the fragment*/   
        
    	for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                /*Compare the elements in pairs, if they are in the wrong order, then swap them*/
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    
}
