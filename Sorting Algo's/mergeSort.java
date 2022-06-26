import java.util.*;
public class mergeSort{
	public static void main(String args []){
		// Given Array
		int arr [] = {2,4,1,3,5};
		int l = 0; 
		int r = arr.length-1;
		sort(arr,l, r);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int arr[], int l, int r){
		if(l<r){
			//finding mid value of array
			int m = l+(r-l)/2;


			//dividing the array into sub arrays
			sort(arr,l,m);
			sort(arr,m+1,r);

			//merging the array from subparts with sorting
			merge(arr,l,m,r);
		}
	}

	public static void merge(int arr[], int l, int m, int r){
		// finding the size of sub arrays in which the array is divided
		int n1 = m-l+1;
		int n2 = r-m;

		//declaring the size of subarray
		int L[] = new int[n1];
		int R[] = new int[n2];


		int i =0, j=0;

		// assigning the value to the subarrays
		for(i = 0; i<n1; i++){
			L[i] = arr[l+i];
		}

		for(j = 0; j < n2; j++){
			R[j] = arr[m+1+j];
		}

		int k =0;
		i=0; j=0;

		while(i<n1 && j<n2){
			if(L[i] <= R[j]){
				arr[l+k] = L[i];
				i++;
			}else{
				arr[l+k] = R[j];
				j++;
			}
			k++;
		}

		while(i < n1){
			arr[l+k] = L[i];
			i++;
			k++;
		}

		while(j < n2){
			arr[l+k] = R[j];
			j++;
			k++;
		}
	}
}