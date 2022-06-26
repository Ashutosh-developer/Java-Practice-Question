public class insertionSort{
	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};

		//insertion Sort
		//traversing the array for comparison
		for(int i = 0; i<arr.length; i++){
			int current = arr[i];
			int j = i-1;
		//comparing the values and moving them toward right if they are greater
		while((j>=0) && (current <arr[j])){
			arr[j+1] = arr[j];
			j--;
		}
		//if it is at right place than move forward
		arr[j+1]= current;
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