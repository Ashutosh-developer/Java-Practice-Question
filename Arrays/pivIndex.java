public class pivIndex{
	public static void main(String[] args) {
		int arr[] = {1, 7, 3, 6, 5, 6};
		
		System.out.println(pivotIndex(arr));
	}

	public static int pivotIndex(int [] arr){
		int total_sum = 0;

		for(int i = 0; i < arr.length; i++){
			total_sum += arr[i];
		}

		int left_sum = 0;

		for(int i = 0; i<arr.length; i++){
			if(i != 0){
				left_sum += arr[i-1];
			}

			if(total_sum - left_sum - arr[i] == left_sum){
				return i;
			}
		}

		return -1;
	}
}