import java.util.*;

public class pattern2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int line = 1; line <= n; line++){
			for(int star = 1; star <= n-line+1; star++){
				// int k = n;
				System.out.print(star);
				// k--;
			}
			System.out.println();
		}
	}
}