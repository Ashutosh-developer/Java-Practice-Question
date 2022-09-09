import java.util.*;

public class Integer_Question6{
	public static void main(String[] args) {
		int n = 15;

		System.out.println(trailingZeroes(n));
	}

	public static int trailingZeroes(int n){
		int count = 0;

		for(int i = 5; i <= n; i = i*5){
			count = count + n/i;
		}

		return count;
	}
}