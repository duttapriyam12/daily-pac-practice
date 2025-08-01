package coding_Practises;

public class kadanes_pac4 {
	public static void kadanes(int numbers[]) {
		int cs = numbers[0];
		int ms= numbers[0];
		for(int i=1;i<numbers.length;i++) {
			cs = cs+numbers[i];
			if(cs<numbers[i]) {
				cs=numbers[i];
			}
			 ms = Math.max(cs,ms);
		}
		System.out.println("Our max sub array sum is: "+ms);
	}
	public static void main(String[] args) {
		int numbers[]= {-1,5,-6,4};
		kadanes(numbers);
	}
}
