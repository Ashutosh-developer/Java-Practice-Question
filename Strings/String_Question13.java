import java.util.*;

public class String_Question13{
	public static void main(String[] args) {
		String s = "abcd";
		char search = 'n';

		/*if(firstOccurance(s,search) == -1){
			System.out.println("The character is not present in String");
		}else{
			System.out.println(firstOccurance(s,search));
		System.out.println(lastOccurance(s,search));
		}*/

		getIndices(s,'b',0);

		System.out.println("First occurence : " + first);
		System.out.println("Last occurence : " + last);
	}

	public static int first = -1;
	public static int last = -1;

	public static void getIndices(String str, char el, int idx) {
		if(idx == str.length()) {
			// System.out.println(first);
			// System.out.println(last);
			return;
		}
		if(str.charAt(idx) == el) {
			if(first == -1) {
				first = idx;
			} else {
			last = idx;
		}
		if(last == -1){
			last = first;
		}
	}
	getIndices(str, el, idx+1);
}

	public static int firstOccurance(String s, char search){
		int temp = -1;
		for(int i = 0; i < s.length(); i++){
			if(search == s.charAt(i)){
				temp = i;
				break;
			}else{
				//System.out.println("String not found");
				temp = -1;
			}
		}
		return temp;
	}

	public static int lastOccurance(String s, char search){
		int temp = -1;
		for(int i = 0; i < s.length(); i++){
			if(search == s.charAt(i)){
				temp = i;
			}
		}
		return temp;
	}
}