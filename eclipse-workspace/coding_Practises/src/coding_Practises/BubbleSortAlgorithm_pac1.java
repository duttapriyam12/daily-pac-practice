package coding_Practises;

public class BubbleSortAlgorithm_pac1 {
	public static void bubbleSort(int arr[]) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        boolean swapped = false;  // To check if any swap happened during this pass
	        for (int j = 0; j < arr.length - 1 - i; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // Swap arr[j] and arr[j+1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;

	                swapped = true; // Set swapped to true if a swap occurred
	            }
	        }
	        // If no two elements were swapped in inner loop, array is sorted
	        if (!swapped) 
	            break;
	      	    }
	}

	public static void printArr(int arr[]) {
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}

	public static void main(String args[]) {
	    int arr[] = {5, 4, 1, 3, 2};
	    bubbleSort(arr);
	    printArr(arr);
	}
}	
