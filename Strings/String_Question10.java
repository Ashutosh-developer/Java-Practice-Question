//import java.util.*;

public class String_Question10{
	public static void main(String[] args) {
		String str = "pwwkew";

		System.out.println(nonRepeatingSubstring(str));
	}

	public static int nonRepeatingSubstring(String str){
		int count = 0, msf = 0;
		for(int i = 0; i < str.length()-1; i++){
			int j = i+1;

			if(str.charAt(i) != str.charAt(j)){
				count++;
			}else{/  
				count = 0;
			}

			if(count > msf){
				msf = count;
			}
		}
		return msf;
	}
}