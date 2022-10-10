public class searchInArr{
	public static void main(String[] args) {
		int arr[] = {1,3,5,6,7,33,55,677};
		int a = 5;
		searchInArr(arr, a);
		
	}

	public static void searchInArr(int arr[], int a){
		for(int i =0; i<=arr.length-1; i++){
			if(arr[i]==a){
				System.out.println(i);
			}
		}
	}
}