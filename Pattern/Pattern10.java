public class Pattern10 {
	public static void main(String[] args) {
		
		int n = 4;

		for(int i = 1; i<=n; i++){

			for(int j = 1; j<=i; j++){
				System.out.print("*\t");
			}
			
			System.out.println();

			for(int j = n-1; j>=0; j--){
				System.out.println("\t");
			}

		}
	}
	
}