import java.util.*;

class Strings_Question3{

	static List <String> al = new ArrayList <>();

	public static void main(String []args){
		
		String s = "abcd";
		findSubsequences(s,"");
		System.out.println(al);
	}

	private static void findSubsequences(String s, String ans){
		if(s.length()==0){
			al.add(ans);
			return;
		}

		findSubsequences(s.substring(1), ans+s.charAt(0));

		findSubsequences(s.substring(1), ans);
	}
}