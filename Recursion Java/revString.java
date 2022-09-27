public class revString{
	public static void main(String[] args) {
		String str = "Abcd";
		int n = str.length()-1;
		printRev(str, n);
	}

	public static void printRev(String str,int idx){
		if(idx == 0){
			System.out.print(str.charAt(idx));
			return;
		}

		System.out.print(str.charAt(idx));
		printRev(str,idx-1);
	}
}