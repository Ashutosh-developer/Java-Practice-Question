import java.util.*;

public class Integer_Question7{
	public static void main(String[] args) {
		Double x = 2d;
		int n = 6;

		System.out.println(myPow(x,n));
	}

	public static double myPow(double x, int n){
		double ans = 1.0;
		long num = n;

		if(num < 0){
			num = num-1;
		}

		while(num>0){
			if(num % 2 == 0){
				x = x * x;
				num = num/2;
			}else{
				ans = ans * x;
				num = num - 1;
			}
		}

		if(n < 0){
			return (double)(1.0)/(double)(ans);
		}
		return ans;
	}
}