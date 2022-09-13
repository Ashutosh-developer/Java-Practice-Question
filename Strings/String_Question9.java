import java.util.*;
import java.util.Arrays;

public class String_Question9{
	public static void main(String[] args) {
		String a = "silent";
		String b = "listen";

		char s1[] = "geeksforgeeks".toCharArray();
	    char s2[] = "forgeeksgeeks".toCharArray();
 

		System.out.println(anagram3(a,b));
	}

	public static boolean anagram(char[] s1, char[] s2){

		// Get lengths of both strings
        int n1 = s1.length;
        int n2 = s2.length;
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(s1);
        Arrays.sort(s2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++){
            if (s1[i] != s2[i])
                return false;
        }
 
        return true;
	}

	static int NO_OF_CHARS = 256;

	public static boolean anagram2(char []s1,char [] s2){
		int count1[] = new int[NO_OF_CHARS];
		Arrays.fill(count1,0);

		int count2[] = new int [NO_OF_CHARS];
		Arrays.fill(count2,0);
		int i;

		for(i = 0; i < s1.length && i < s2.length; i++){
			count1[s1[i]]++;
			count2[s2[i]]++;
		}

		if(s1.length != s2.length){
			return false;
		}

		for(i = 0; i < NO_OF_CHARS; i++){
			if(count1[i] != count2[i]){
				return false;
			}
		}
		return true;
	}

	public static boolean anagram3(String a, String b){
		if(a.length() != b.length()){
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for(int i = 0; i < a.length(); i++){
			if(map.containsKey(a.charAt(i))){
				map.put(a.charAt(i),map.get(a.charAt(i)+1));
			}else{
				map.put(a.charAt(i),1);
			}
		}

		for(int i = 0; i < b.length(); i++){
			if(map.containsKey(b.charAt(i))){
				map.put(b.charAt(i), map.get(b.charAt(i))-1);
			}
			else{
				return false;
			}
		}
		return true;
	}
}