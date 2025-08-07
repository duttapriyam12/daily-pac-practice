package coding_Practises;

public class bubbleSort_pac3 {
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			boolean swapped = false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped =true;
				}
			}
			if(!swapped) break;
		}
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {4,1,2,3,5,0};
		bubbleSort(arr);
		printArray(arr);
	}

}
