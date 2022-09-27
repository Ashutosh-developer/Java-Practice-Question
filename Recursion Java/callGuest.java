import java.util.*;

public class callGuest{
	public static void main(String[] args) {
		int n = 2;
		System.out.println(callGuests(n));
	}

	public static int callGuests(int n ){
		if(n <= 1){
			return 1;
		}

		//single
		int ways1 = callGuests(n-1);

		//pair
		int ways2 = callGuests(n-2)*(n-1);

		return ways1 + ways2;
	}
}