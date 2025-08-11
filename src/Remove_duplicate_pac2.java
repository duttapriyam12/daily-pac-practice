package Daily_Coding_Practises;

public class Remove_duplicate_pac2 {
   public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[]map) {
	   if(idx==str.length()){
		   System.out.println(newStr);
		   return;
	   }
	   char currChar = str.charAt(idx);
	   if(!map[currChar-'a']) {
		   map[currChar-'a']=true;
		   newStr.append(currChar);
	   }
	   removeDuplicates(str,idx+1,newStr,map);
   }
   public static void main(String[] args) {
	String str="aabbccd";
	removeDuplicates(str,0,new StringBuilder(),new boolean[26]);
}
}
