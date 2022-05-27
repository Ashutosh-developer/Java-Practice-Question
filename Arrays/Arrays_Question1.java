import java.util.*;

// Q- Reverse an array

//5,4,3,2,1 		i=0			j=arr.length

class Arrays_Question1{
	public static void main(String[] args) {
		// Input

		int[] arr = {1, 2, 3, 4, 5};
		
		// reverse(arr);
		reverseWithoutSpace(arr);
		
	}

	// Extra space
	// Time Complexity -> O(n)
	// Space Complexity -> O(n)
	public static void reverse(int[] arr){
		int[] reverse = new int[arr.length];
		int j = 0;

		for(int i = arr.length-1; i>=0; i--){
			reverse[j] = arr[i];
			j = j+1;
		}

		System.out.println(Arrays.toString(reverse));

	}
	

	// Without space
	// Time Complexity -> O(n)
	// Space Complexity -> O(1)
	public static void reverseWithoutSpace(int arr[]){
		int i = 0;
		int j = arr.length -1;

		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		System.out.println(Arrays.toString(arr));
	}

}