import java.util.*;
public class Arrays_Question18{
	public static void main(String args[]){
	int arr[] = { 1, 3, 4, 2, 7, 5, 8, 6};

	findMedian(arr);
	}

	private static void findMedian(int []arr){
	
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