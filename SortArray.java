package InterviewQuestion;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		
		int[] arrNum = {4, 3, 1, 2, 7}; 
		bSort(arrNum);
    	System.out.println(Arrays.toString(arrNum));
    	
      	arrNum = new int[] {4, 3, 10, 22, 7};
      	bSort(arrNum);
        System.out.println(Arrays.toString(arrNum));
        
        arrNum = new int [] {6, 5, 2, 1, 9, 10, 0};
     	bSort(arrNum);  
    	System.out.println(Arrays.toString(arrNum));
		
   }
	 public static void sSort(int[] arr) {
	     
	        for (int i = 0; i < arr.length; i++) {
	            int mIndex = i;
	            int min = arr[i];
	           
	            for (int j = i + 1; j < arr.length; j++) {
	                if (min > arr[j]) {
	                    min = arr[j];
	                    mIndex = j;
	                }
	            }
	           
	            int tmp = arr[i];
	            arr[i] = arr[mIndex];
	            arr[mIndex] = tmp;
	        }
	    }

	    /**
	     * Bubble Sort
	     * In bubble sort we push the biggest elements to the end of array by switching pairs of elements
	     * if they are not in correct order.
	     */
	    public static void bSort(int[] arr) {
	        boolean isNotSorted = true;
	        // we need this because every iteration of outer loop we don't have to check last element again
	        int len = arr.length;

	        // loop over the array
	        while (isNotSorted) {
	            len--;

	            // assume is all sorted
	            isNotSorted = false;

	            // loop over the array
	            for (int i = 0; i < len; i++) {
	                // take two pairs and check they are in correct order.
	                if (arr[i] > arr[i + 1]) {
	                    // if not swap them
	                    int tmp = arr[i];
	                    arr[i] = arr[i + 1];
	                    arr[i + 1] = tmp;

	                    // if something was swapped then we need keep outer loop ON
	                    // if nothing got swapped then array sorted.
	                    isNotSorted = true;
	                }
	            }
	        }
	    }
	}


