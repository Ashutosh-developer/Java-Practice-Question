public class printSub{
	public static void main(String[] args) {
		String str = "abc";
		subsequences(str, 0 , " ");
	}

	public static void subsequences(String str, int idx, String newString){
		if(idx == str.length()){
			System.out.print(newString + ", ");
			return;
		}

		char currChar = str.charAt(idx);

		//to be 
		subsequences(str, idx +1, newString + currChar);

		//or not to be
		subsequences(str, idx +1, newString);
	}
}