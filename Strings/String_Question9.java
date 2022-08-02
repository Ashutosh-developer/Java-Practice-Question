import java.util.*;
public class String_Question9{
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";

		System.out.println(anagram(s1,s2));
	}

	public static boolean anagram(String s1, String s2){

		if(s1.length() == s2.length()){
			for(int i = 0; i<s1.length(); i++){
				for(int j = 0; j<s2.length(); j++){
					if(s1.charAt(i) == s2.charAt(j));
				}
			}
		}
	}