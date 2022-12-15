public class Pattern19{
	public static void main(String args[]){
		int n = 5;

		for(int i = n; i > 0 ; i--){
			for(int j = n; j > n-i; j--){
				System.out.print(j+" ");
			}
			System.out.println();
		} 
	}
}