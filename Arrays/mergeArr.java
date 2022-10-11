import java.util.*;
public class mergeArr{
	public static void main(String args[]){
	int arr1[] = {2,3,5,7};
	int arr2[] = {1,4,6,8,9};
	mergeArray(arr1,arr2);
	}

	public static void mergeArray(int [] arr1, int [] arr2){
		int i = 0;
		int j = 0; 
		int k = arr1.length-1;

	while(i<=k && j<arr2.length-1){
		if(arr1[i] < arr2[j]){
			i++;
		}else{
			int temp = arr2[j];
			arr2[j] = arr1[k];
			arr1[k] = temp;
			j++;
			k--;
			}
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.print(Arrays.toString(arr1) +" "+ Arrays.toString(arr2));

	}
}