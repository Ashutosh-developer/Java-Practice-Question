public class Pattern4{
	public static void main(String[] args) {
		int st = 5;

		for(int i = 1; i<=st; i++){
			for(int j = 1; j<=st-i; j++){
				System.out.print("\t");
			}
			for(int j = 1; j<=i; j++){
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}