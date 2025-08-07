package coding_Practises;

public class SelectionSort_pac2 {
	public static void Selectionsort(int array[]) {
		for(int i=0;i<array.length-1;i++) {
			int minPos=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[minPos]>array[j]) {
					minPos=j;
				}
			}
			//swap
			int temp=array[minPos];
			array[minPos]=array[i];
			array[i]=temp;
		}
	}
	
	public static void printarrays(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String args[]) {
		int array[]= {5,4,1,3,2};
		Selectionsort(array);
		printarrays(array);
	}
}
