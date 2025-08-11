package Daily_Coding_Practises;

public class Binary_String_print_pac1 {
	public static void printBinString(int n, int lastPlace, String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		printBinString(n-1, 0, str+"0");   // Always put 0
		if(lastPlace==0) {     // Put 1 only if lastPlace is 0
			printBinString(n-1, 1, str+"1");
		}
	}
	public static void main(String[] args) {
		printBinString(3, 0, "");
	}

}
