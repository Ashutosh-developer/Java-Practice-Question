import java.util.*;
public class Arrays_Question2{

	// pairs is used to get multiple outputs from a method...

	static class Pair{
		int min;
		int max;
	}

	//construct a function to find the min max value in an array
	static Pair getMinMax(int arr[], int n){
		Pair minmax = new Pair();           // object for new pair
		int i;


		// exceptional case for single element array

		if(n==1){
			minmax.max = arr[0];
			minmax.min = arr[0];
			return minmax;
		}

		// if more than one element is present in an array
		if(arr[0] > arr[1]){
			minmax.max = arr[0];
			minmax.min = arr[1];
		} else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}

		//more than 2 elements
		for(i =2; i<n; i++){
			if(arr[i] > minmax.max){
				minmax.max = arr[i];
			}else {
				minmax.min = arr[i];
			}
		}
		return minmax;
	}


	public static void minmax2(int arr[], int min2, int max2){
		Arrays.sort(arr);
		min2 = arr[0];
		max2 = arr[arr.length-1];

		System.out.println(min2 + " " + max2);

		return;
	}

	public static void main(String[] args) {
		int arr[] = {1000,11,34,669,1,3000};
		int arr_size = 6;
		int min2 = 0;
		int max2 = 0;

		// minmax2(arr, min2, max2);

		Pair minmax = getMinMax(arr, arr_size);

		System.out.printf("\n Minimum element is % d", minmax.min);
		System.out.printf("\n Maximum element is % d", minmax.max);
	}
}