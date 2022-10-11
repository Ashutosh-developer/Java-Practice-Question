public class sumPairs{
	public static void main(String[] args) {
		//Count pairs with given sum
		int arr[] = {-1,1,5,5,7};
		pairsum(arr);
	}

	public static void pairsum(int arr[]){
		int count = 0;
		int i =0;
		int j = arr.length-1;
		int sum = 6;
		while(i<j){
			if(arr[i]+arr[j]==sum){
				count++; 
				j--;
			}else if(arr[i]+arr[j]>sum){
				j--;
			}else{
				i++;
			}
		}
		System.out.println(count);
	}
}