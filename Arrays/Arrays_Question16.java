import java.util.*;
public class Arrays_Question16{
	public static void main(String[] args) {
		int arr[] = {1,4,6,45,10,8};
		int n = arr.length-1;

		// sum to be searched
		int X = 13;

		//bruteforce(arr, n, X);
		tripletSum(arr,n,X);
	}

	public static void bruteforce(int arr[], int n, int X){
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				for(int k = i+2; j<n; j++){
					if(arr[i] + arr[j] + arr[k] == X){
						System.out.println("Sum is present in array");
					}
				}
			}
		}
	}

	public static void tripletSum(int arr[], int n, int X){
		for(int i = 0; i < n; i++){
			int j = i+1; 
			int k = n;
			while(i<k){
				if(arr[i] + arr[j] + arr[k] == X){
					System.out.println("Sum is present in array");
					break;
				}else if(arr[i] + arr[j] + arr[k] > X){
					k--;
				}else{
					j++;
				}
			}
		}
	}
}