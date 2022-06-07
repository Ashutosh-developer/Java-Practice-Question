public class Pattern10 {
	public static void main(String[] args) {
		
		int st = 5;
		int sp = st-1;

		for(int i = 1; i<=st; i++){

			for(int j = sp; j<=1; j--){
				System.out.print("\t");
			}
			for(int j = 1; j<=st; j++){
				System.out.print("*\t");
			}

			System.out.println();
		}
	}
	
}