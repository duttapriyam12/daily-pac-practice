package coding_Practises;

public class BubbleSort_pac2 {
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			boolean swapped = false;
			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,3};
		bubbleSort(arr);
		printArr(arr);
	}
	

}
