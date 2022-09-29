public class BS_Question3{
	public static void main(String[] args) {
		int a [] = {4,6,7,8,9,1,3};
		// int low = 0;
		// int high = a.length-1;
		System.out.println(findMin(a));
	}

	public static int findMin(int a[]){
		if(a.length == 1) return a[0];
		if(a.length == 2) return Math.min(a[0], a[1]);
		if(a[0] < a[a.length-1]) return a[0];

		int left = 0;
		int right = a.length-1;

		while(left <= right){
			int mid = left +(right - left)/2;

			//the array is decreasing at mid+1
			if(a[mid] > a[mid+1]) return a[mid+1];

			//the array is decreasing at mid
			if(a[mid-1] > a[mid]) return a[mid];

			//discard the sorted part >> increasing part

			if(a[left] < a[mid])
				left = mid+1;
			else
				right = mid-1;
		}
		return 0;
	}

	// static int findMin(int arr[], int low, int high)
 //    {
 //        // This condition is needed to handle the case when
 //        // array is not rotated at all
 //        if (high < low)
 //            return arr[0];
 
 //        // If there is only one element left
 //        if (high == low)
 //            return arr[low];
 
 //        // Find mid
 //        int mid
 //            = low + (high - low) / 2; /*(low + high)/2;*/
 
 //        // Check if element (mid+1) is minimum element.
 //        // Consider the cases like {3, 4, 5, 1, 2}
 //        if (mid < high && arr[mid + 1] < arr[mid])
 //            return arr[mid + 1];
 
 //        // Check if mid itself is minimum element
 //        if (mid > low && arr[mid] < arr[mid - 1])
 //            return arr[mid];
 
 //        // Decide whether we need to go to left half or
 //        // right half
 //        if (arr[high] > arr[mid])
 //            return findMin(arr, low, mid - 1);
 //        return findMin(arr, mid + 1, high);
 //    }
}