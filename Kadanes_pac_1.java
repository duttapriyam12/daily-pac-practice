package coding_Practises;

public class Kadanes_pac_1 {
	public static void main(String args[]) {
		int numbers[]= {-2,-3,-1};
		kadanes(numbers);
	}
	public static void kadanes(int numbers[]) {
		int cs = numbers [0];
		int ms = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			cs = cs+numbers[i];
			if(cs<numbers[i]) {
				cs = numbers[i];
			}
			ms = Math.max(ms,cs);
		}
		System.out.println("Our max sub array sum is : "+ms);
	}
}



