public class Pattern20{
	public static void main(String[] args){
		
		int n = 5;

		for(int i = n; i >= 1; i--){
			int num = 1;
			for(int j = n; j > n-i; j--){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}