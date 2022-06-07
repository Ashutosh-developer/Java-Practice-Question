import java.util.*;

class Arrays_Question5{
	public static void main(String[] args) {
		int arr[] = {1,2,-6,33,-3, 4,-5};
		sorting_arr(arr);
	}

	public static void sorting_arr(int arr[]){
		int high = arr.length-1;
		int i = 0;
		while(i<high){
			if(arr[i]>0){
				int temp = arr[high];
				arr[high] = arr[i];
				arr[i] = temp;
				high--;
			}else{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}