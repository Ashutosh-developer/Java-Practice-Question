class duplicateZero{
	public static void main(String[] args) {
		int arr[] = {1,0,2,0,4};

		int length = arr.length;
		int [] res = new int[length];
		// int j = 0;

		// printarr(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

		duplicateZeroes(arr, res, length);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(res[i] + ", ");
		}
		System.out.println();
		// printarr(arr);
	}

	public static void duplicateZeroes(int []arr, int[] res, int length){
		

		for(int i = 0; i< arr.length-1; i++){
			res[i] = arr[i];
			if(arr[i] == 0){
				res[i+1] = 0;
				if((i+1)<=arr.length && (i+2)<=arr.length){
				 arr[i+1] = res[i+2];
				}
			
			
		}
		
		
		}

	}

	/*public static void printarr(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}*/
}