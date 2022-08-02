// import java.util.*;
class String_Question5{
	public static void main(String args[]){
		String s = "0100110101";

		maxSubstring(s);
	}

	public static void maxSubstring(String s){
		int count = 0;
		int count1 = 0;
		int cnt = 0;

		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)=='0'){
				count++;
			}else{
				count1++;
			}

			if(count==count1){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}