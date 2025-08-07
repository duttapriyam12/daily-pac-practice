package coding_Practises;

public class kadanes_pac2 {
	public static void Kadanes(int numbers[]) {
		int ms= numbers[0];
		int cs=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			cs =cs+numbers[i];
			if(cs<numbers[i]) {
				cs=numbers[i];
			}
		
		 ms=Math.max(ms,cs);
	  }
	System.out.println("Our maximum sub array sum is: "+ms);
 }
	public static void main(String[] args) {
		int numbers[]= {-1,-2,-4};
		Kadanes(numbers);
	}
}
