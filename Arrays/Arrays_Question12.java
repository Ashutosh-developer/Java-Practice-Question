import java.util.*;

public class Arrays_Question12{
	public static void main(String[] args) {
		int arr[] = {1,5,1,7};
		int n = arr.length;
		int k = 6;
		getPairsCount(arr, n, k);
	}

	public static void getPairsCount(int []arr,int n, int k){
		HashMap<Integer,Integer>hm = new HashMap<>();

		for(int i = 0; i<n; i++){

			if(!hm.containsKey(arr[i]))
				hm.put(arr[i], 0);

			hm.put(arr[i],hm.get(arr[i])+1);
		}
		int twice_count=0;

		for(int i = 0; i<n; i++){
			if(hm.get(k - arr[i])!=null)
				twice_count += hm.get(k-arr[i]);

			if(k-arr[i] == arr[i]){
				twice_count--;
			}
		}
		System.out.println(twice_count/2);
	}
}