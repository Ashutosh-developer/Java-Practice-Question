public class BS_Question2{
	public static void main(String args[]){
		int a [] = {5,6,7,8,9,0,1,3,4};
		int num = 3;
		System.out.println(search(a, num));
	}

	public static int search(int a[], int target){
		int left = 0;
		int right = a.length-1;

		while(left <= right){
			int mid = left + (right-left)/2;

			if(a[mid] == target){
				return mid;
			}
			if(a[left] <= a[mid]){
				if(a[left] <= target && target < a[mid]){
					right = mid-1 ;
				}else{
					left = mid+1;
				}
			}else{
				if(a[mid] < target && target <= a[right]){
					left = mid+1;
				}else{
					right = mid-1;
				}
			}
		}
		return -1;
	}
}