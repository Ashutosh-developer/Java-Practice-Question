public class remDuplicates{
	public static void main(String args[]){
		String str = "abaacdaefaah";
		removeDuplicates(str,0,"");
	}

	public static boolean [] map = new boolean[26];

	public static void removeDuplicates(String s, int idx, String newString){
		if(idx == s.length()){
			System.out.println(newString);
			return;
		}

		char currChar = s.charAt(idx);
		if(map[currChar - 'a']){
			removeDuplicates(s, idx+1, newString);
		}else{
			newString += currChar;
			map[currChar-'a'] = true;
			removeDuplicates(s, idx+1, newString);
		}
	}
}