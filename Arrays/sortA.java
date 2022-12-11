import java.util.Arrays;

public class sortA{
	// moving 0's,1's,2's in sorted order
	public static void Sorting_a (int a[], int size){
		int zero = 0;
		int one = 0;
		int two = 0;


		for(int i = 0; i < size; i++ ){
			if(a[i] == 0){
				zero++;
			} else if(a[i] == 1){
				one++;
			} else if(a[i] == 2){
				two++;
			}
		}

		for(int i = 0; i < size; i++){
			if(zero>0){
				a[i]=0;
				zero--;
			}else if(one>0){
				a[i]=1;
				one--;
			}else if(two>0){
				a[i]=2;
				two--;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	// sorting of array without using loops
	/**
	 * @param arr
	 */
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

	public static void main(String[] args) {
		int arr[] = {1,2,2,1,2,0,0,0};
		// int size = arr.length;

		//Sorting_a(a, size);
		Sorted_array(arr);
	}
}