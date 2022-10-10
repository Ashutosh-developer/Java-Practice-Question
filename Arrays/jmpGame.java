public class jmpGame{
	public static void main(String[] args) {
		int arr[] = {3,2,1,0,4};
		boolean possible = canJump(arr);
		if(possible){
			System.out.println("It is possible");
		}else{
			System.out.println("It is not possible");
		}
	}

	public static boolean canJump(int []nums){
		int reachable = 0;
		for(int i = 0; i < nums.length && i <= reachable; i++){
			reachable = Math.max(reachable, i + nums[i]);
			if(reachable >= nums.length-1){
				return true;
			}
		}
		return false;
	}
}