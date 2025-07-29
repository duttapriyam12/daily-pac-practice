package coding_Practises;

public class kadanes_pac3 {
      public static void kadanes(int numbers[]) {
    	  int ms=numbers[0];
    	  int cs = numbers[0];
    	  for(int i=1;i<numbers.length;i++) {
    		  if(cs<numbers[i]) {
    			  cs=numbers[i];
    		  }
    		  ms=Math.max(cs, ms);
    	  }
    	  System.out.print("Our maximum sub array sum is: "+ms);
      }
      public static void main(String[] args) {
		int numbers[]= {-1,2,-4};
		kadanes(numbers);
	}
}
