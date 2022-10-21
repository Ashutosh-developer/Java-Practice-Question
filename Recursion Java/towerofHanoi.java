import java.util.*;

public class towerofHanoi{
	public static void main(String args[]){
		int n = 5;
		towerOfHanoi(n,"S","H","D");
	}

	public static void towerOfHanoi(int n, String src, String Helper, String dest){
		if(n==1){
			System.out.println("transfer disk "+n+" from "+src+" to "+dest);
			return;
		}

		towerOfHanoi(n-1, src, dest, Helper);
		System.out.println("transfer disk "+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1, Helper, src, dest);
	}
}