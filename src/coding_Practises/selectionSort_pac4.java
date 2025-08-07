package coding_Practises;

public class selectionSort_pac4 {
    public static void selectionSort(int arr[]) {
    	for(int i=0;i<arr.length-1;i++) {
    		int minPos = i;
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[minPos]>arr[j]) {
    				minPos=j;
    			}
    		}
    		//swap
    		int temp=arr[minPos];
    		arr[minPos]=arr[i];
    		arr[i]=temp;
    	}
    }
    
    public static void printArray(int arr[]) {
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
     }
     public static void main(String[] args) {
    	int arr[]= {4,2,0,1,5,6,10,9};
    	selectionSort(arr);
    	printArray(arr);
    }
}
