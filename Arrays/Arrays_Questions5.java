import java.util.*;

class Arrays_Question5{
	public static void main(String[] args) {
		int arr[] = {1,2,0,0,1,2,2,1};
		Sorted_array(arr);
	}

	public static void Sorted_array(int []arr){
		int temp = 0;
		int mid = 0;
		int low = 0;
		int high = arr.length-1;

		while(mid<= high){
			if(arr[mid]==0){
				temp = arr[low];
				arr[low]= arr[mid];
				arr[mid]= temp;
				low++;
				mid++;
			}else if(arr[mid]==1){
				mid++;
			}else if(arr[mid]==2){
				temp = arr[high];
				arr[high]= arr[mid];
				arr[mid] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}