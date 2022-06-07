public class Pattern7{
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i<=n; i++){
			int num =1;
			for(int j = i; j<=n; j++){
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}
}