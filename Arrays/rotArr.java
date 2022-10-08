public class rotArr{
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		rotate(nums, 3);
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]);
		}
	}

	public static void rotate(int[] nums, int k) {
        int n = nums.length-1;
        int r = k % nums.length;

		reverse(0 , n, nums);        
        reverse(0 , r-1, nums);
        reverse(r , n, nums);
    }
    
    public static void reverse(int i, int j, int nums[]){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}