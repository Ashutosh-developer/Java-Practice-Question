import java.util.*;
public class String_Question7{
	public static void main(String[] args) {
		String s1 = "saturday";
		String s2 = "sunday";

		System.out.println(editDistance(s1, s2, s1.length(), s2.length()));
	}

	public static int editDistance(String s1, String s2, int m, int n){

		if(m==0){
			return n;
		}

		if(n==0){
			return m;
		}

		if(s1.charAt(m-1) == s2.charAt(n-1))
			return editDistance(s1, s2, m-1, n-1);

		return 1 + Math.min(editDistance(s1, s2, m, n - 1),
		           Math.min(editDistance(s1, s2, m - 1, n),
                   editDistance(s1, s2, m - 1,n - 1)));
	}
}