public class printNum{
	public static void main(String[] args) {
		int n = 5;
		Printnum(n);
	}

	public static void Printnum(int n){
		if(n==0){
			return;
		}

		System.out.println(n);
		Printnum(n-1);
	}
}