package Daily_Coding_Practises;

public class friends_Pairing_pac2 {
	public static int friendsPairing(int n) {
		if(n==1 || n==2) {
			return n;
		}
		int fnm1= friendsPairing(n-1);
		int fnm2= friendsPairing(n-2);
		int pairways = (n-1) * fnm2;
		int totalways = fnm1 + pairways;
		return totalways;
	}
	public static void main(String[] args) {
		System.out.println(friendsPairing(3));
	}

}
