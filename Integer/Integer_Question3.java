import java.util.*;

public class Integer_Question3{
	public static void main(String[] args) {
		int x = 123454321;

		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x){

		//if there is a negative number
		//if the number end with zero except the number zero

		if(x < 0 || (x != 0 && x % 10 == 0))
			return false;

		int reverse = 0;
		int num = x;

		while(num > reverse){
			int lastDigit = num%10;
			reverse = reverse*10+lastDigit;
			num = num/10;
		}
		return num == reverse/10 || num == reverse;

	}
}