public class Pattern22{
	public static void main(String[] args) {
		int n = 5; 
		for(int i = 1; i <= n; i++){
			int num = n;
			for(int j = 1; j <= i; j++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}