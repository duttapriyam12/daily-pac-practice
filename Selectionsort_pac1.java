package coding_Practises;

public class Selectionsort_pac1 {
	public static void selectionsort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minPos = i;
			for(int j= i+1;j<arr.length;j++) {
				if(arr[minPos]>arr[j]) {
					minPos=j;
				}
			}
			//swap
			int temp = arr[minPos];
			arr[minPos]=arr[i];
			arr[i]= temp;
		
		}
	}
	public static void printarrays(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {5,4,1,3,2};
		selectionsort(arr);
		printarrays(arr);
	}
}
