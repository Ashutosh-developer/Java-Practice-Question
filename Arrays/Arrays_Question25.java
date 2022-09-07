import java.util.*;
import java.util.HashSet;

public class Arrays_Question25{
	public static void main(String[] args) {
		int a [] = {1,2,1,2,3};

		System.out.println(singleNumber2(a));
		//System.out.println(singleNumber(a));

	}

	public static int singleNumber2(int [] a){
		int ans = a[0];

		for(int i = 1; i < a.length; i++){
			ans = ans ^ a[i];
		}
		return ans;
	}

	public static int singleNumber(int a []){
		if(a.length == 1)
			return a[0];

		HashSet<Integer> set = new HashSet();
		for(int i = 0; i < a.length; i++){

			if(set.contains(a[i])){
				set.remove(a[i]);
			}
			else{
				set.add(a[i]);
			}
		}
		return set.iterator().next();
	}
}