public class BS_Question1{
	public static void main (String srgs []){
		int arr []= {1,23,55,63,67,76,77,88,93,94,96,99};

		int Target = 77;
		System.out.println(searchInArr(arr, Target));
	}

	public static int searchInArr(int arr[], int Target){
		int left = 0;
		int right = arr.length-1;
		while(left <= right){
			int mid = left + (right - left)/2;
			if(arr[mid] == Target){
				return mid;
			}
			if(Target > arr[mid]){
				left = mid+1;
			}else{
				right = mid-1;
			}
		}
		return -1;
	}
}