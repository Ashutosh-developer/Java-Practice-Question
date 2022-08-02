import java.util.*;

class Strings_Question8{
	public static void main(String[] args) {
	String s = "My name is Ashutosh";

	System.out.println(insertionInString(s));

	}

	public static String insertionInString(String s){
		int n = s.length();

		//using for loop traversing the string and replacing the space with '#'
		
		for(int i = 0; i<n; i++){

			if(s.charAt(i)==' '){
				s = (s.substring(0,i) + "#" + s.substring(i+1, n));
			}

		}

		// System.out.println(s);
		return s;
	}
}