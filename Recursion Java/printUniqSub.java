import java.util.HashSet;
public class printUniqSub{
	public static void main(String[] args) {
		String str = "abc";
		HashSet<String> set = new HashSet<>();
		uniqSubsequences(str, 0 , " ", set);
	}

	public static void uniqSubsequences(String str, int idx, String newString, HashSet<String> set){
		if(idx == str.length()){
			if(set.contains(newString)){
				return;
			}else{
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}

		char currChar = str.charAt(idx);

		//to be 
		uniqSubsequences(str, idx +1, newString + currChar,set);

		//or not to be
		uniqSubsequences(str, idx +1, newString, set);
	}
}