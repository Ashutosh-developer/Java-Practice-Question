import java.util.*;

public class pattern3{
	public static void main (String args []){
		char ch = 'A';
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int line = 1; line <= n; line++){
			for(int j = 1; j <= line; j++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}