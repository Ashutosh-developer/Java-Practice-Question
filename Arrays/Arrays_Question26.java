import java.util.*;

public class Arrays_Question26{
	public static void main(String[] args) {
		int arr[] = {41,18467,6334,26500,19169};
		int n = arr.length;

		System.out.println(countInversion(n, arr));
	}

	public static int countInversion(int n,int arr[]){
		int count = 0;

		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] > arr[j]){
					count++;
				}
			}
		}
		return count;
	}
}