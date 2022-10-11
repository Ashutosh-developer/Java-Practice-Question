import java.util.*;
public class dupliNo{
	public static void main(String args[]){
		//Find the Duplicate Number

		int arr[]= {1,3,4,2,2};
		int n = arr.length;

		//bySorting(arr,n);
		//byBruteforce(arr,n);
		//byIndexSorting(arr,n);
		//byHashset(arr,n);
		byMarking(arr,n);

	}

	public static void bySorting(int arr[],int n){
		//Sorting the array arr
		Arrays.sort(arr);
		int iplusone = 1;

		//traversing the array and searching for duplicate no.
		for(int i = 0; i<n; i++){
			if(arr[i]== arr[iplusone]){
				System.out.println(arr[i]);
				break;
			}
			iplusone++;
		}
	}

	public static void byBruteforce(int arr[], int n){
		int sum = 0;

		//calculating the sum of array by traversing
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
		}

		//calculating the sum by the maths formula or natural no. sum
		int calcSum = (n*(n-1))/2;

		//to find the imposter we are substracting the sum of natural no. from sum of traversed array  
		int difference = sum - calcSum;
		System.out.println(difference);
	}

	public static void byIndexSorting(int arr[], int n){

//If arr[i] == v - 1, it means that the order has been sorted, then skip, i++;

		for(int i = 0; i<arr.length; ){
			int v = arr[i];
			if( v== i+1){
				i++;
			}else if(arr[i]== arr[v-1]){
				System.out.println(arr[i]);
				break;
			}else{
				arr[i] = arr[v-1];
				arr[v-1] = v;
			}
		}
	}

	public static void byHashset(int arr [],int n){
		//Declairing hash set
		//Using a HashSet to record the occurrence of each number.

		Set<Integer>Set = new HashSet<>();
		//traversing the array to store the value in hashset
		for(int i = 0; i<n; i++){
			if(!Set.add(arr[i])){
				System.out.println(arr[i]);
			}
		}
		//System.out.println(arr.length);
	}

	public static void byMarking(int arr[], int n){
		//traversing the array for marking the value
		for(int ar : arr){
			int idx = Math.abs(ar);
			if(arr[idx]<0){
				System.out.println(idx);
			}
			arr[idx] = -arr[idx];
		}

	}
}