public class Arrays_Question8{
	public static void main(String[] args) {
		int arr1[]= {1,5,6,7,8};
		int arr2[]= {1,2,3,4,5};
		int m = arr1.length;
		int n = arr2.length;

		print_union(arr1, arr2, m, n);
	}

	public static void print_union(int arr1[], int arr2[], int m, int n){
		int i = 0;
		int j = 0;

		while(i<m && j<n){
		if(arr1[i]<arr2[j]){
			System.out.print(arr1[i]);
			i++;
		}else if(arr1[i]>arr2[j]){
			System.out.print(arr2[j]);
			j++;
		}else{
			System.out.print(arr2[j]);
			i++;
			j++;
			}
		}
	}
}