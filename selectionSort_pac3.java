package coding_Practises;

public class selectionSort_pac3 {
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minPos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minPos]>arr[j]) {
					minPos=j;
				}
			}
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
		int arr[]= {4,1,2,3,5,6,0};
		selectionSort(arr);
		printArray(arr);
	}
}
