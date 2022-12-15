public class Pattern21{
	public static void main(String[] args) {
		
		int n = 5; 

		for(int i = n; i > 0; i--){

			int num = i; 

			for(int j = n; j > n-i; j--){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}