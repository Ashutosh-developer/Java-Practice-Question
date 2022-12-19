// import java.util.*;
class merge{
	public static void main(String args[]){
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k = 5;

		System.out.println(mergerArray(arr1,arr2,k));
	}

	public static int mergerArray(int arr1[], int arr2[], int k){
		int m = arr1.length-1;
		int n = arr2.length-1;
		int length = m + n + 2;

		int arr3[] = new int[length];

		for(int i = length-1; i>0; i--){
			if(arr1[m]>arr2[n]){
				arr3[i] = arr1[m];
				m--;
			}else{
				arr3[i] = arr2[n];
				n--;
			}
		}

			if(m>0){
				arr3[0] = arr2[0];
			}else{
				arr3[0] = arr1[0];
			}
		return arr3[k];
	}
}