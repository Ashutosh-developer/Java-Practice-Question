class duplicateZero{
	public static void main(String[] args) {
		int arr[] = {1,0,2,0,4};

		int length = arr.length;
		int [] res = new int[length];
		int j = 0;

		// printarr(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

		duplicateZeroes(arr, 0, res, length);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(res[i] + ", ");
		}
		System.out.println();
		// printarr(arr);
	}

	public static void duplicateZeroes(int []arr, int j, int res[], int length){

		for(int i = 0; i< length && j < length; i++){
			if(arr[i] != 0){
				arr[j] = arr[i];
			}else{
				j++;
			}
			j++;
		}

		for(int i = 0; i < length; i++){
			arr[i] = res[i];
		}
	}

	/*public static void printarr(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}*/
}