package coding_Practises;

public class CompressedString_pac3 {
	public static void main(String[] args) {
		String str="abbc";
		StringBuilder result = new StringBuilder();
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}
			else {
				result.append(str.charAt(i-1));
				if(count>1) {
					result.append(count);
					
				}
				count=1;
			}
		}
		result.append(str.charAt(str.length()-1));
		if(count>1) {
			result.append(count);
	}
		System.out.println("Compressed to: "+result.toString());
	}
}
