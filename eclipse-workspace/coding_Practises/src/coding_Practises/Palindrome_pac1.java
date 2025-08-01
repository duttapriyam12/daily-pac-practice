package coding_Practises;

public class Palindrome_pac1 {
	public static boolean isPalindrome(String str) {
		int n=str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str ="xmadam";
		System.out.println("is Palindrome: "+ isPalindrome(str) );
	}
}

