import java.util.*;

public class Arrays_Question15{
	public static void main(String[] args) {
		int arr[] = {1,2,43,0,2,5,6};

		public subWithzero(arr);
	}

	public static void subWithzero(int arr[]){
		HashSet<Integer> prefixSum = new HashSet<Integer>();

		int currentSum = 0;

		for(int i = 0; i<arr.length; i++){
			currentSum += arr[i];

			if(currentSum ==0||
				arr[i] == 0||
				prefixSum.contains(currentSum))
				return true;
			prefixSum.add(currentSum);
		}
		return false;
	}
}