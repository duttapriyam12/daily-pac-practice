package coding_Practises;

public class insertionSort_pac4 {
   public static void insertionSort(int arr[]) {
	   for(int i=1;i<arr.length;i++) {
		   int current = arr[i];
		   int j= i-1;
		   while(j>=0 && arr[j]>current) {
			   arr[j+1]=arr[j];
			   j--;   
		   }
		   arr[j+1]=current;
	   }
   }
   public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {4,1,2,3,6,0};
		insertionSort(arr);
		printArray(arr);
	}
}
