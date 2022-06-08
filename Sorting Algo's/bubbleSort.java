public class bubbleSort{
	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};



		//In bubble sort algorithm, array is traversed from first element to last element. 
		//Here, current element is compared with the next element. 
		//If current element is greater than the next element, it is swapped.

		//bubble Sort

		for(int i =0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j]>arr[j+1]){
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;

					// time complexity = O(n^2)
				}
			}
		}
		printArray(arr);
	}

   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }

}