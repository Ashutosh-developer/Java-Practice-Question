import java.util.*;
public class findMedian{
	public static void main(String args[]){
	int arr[] = { 1, 3, 4, 2, 7, 5, 8, 6};

	find_Median(arr);
	}

	private static void find_Median(int []arr){
	
	Arrays.sort(arr);
	int k = arr.length;
	int mid = k/2;

	if(k % 2 == 0){
		int sum = (arr[mid] + arr[mid])/2;
		System.out.println(sum);
		}else{
			System.out.println(arr[mid]);
		}
	}
}