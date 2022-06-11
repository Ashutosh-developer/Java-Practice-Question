public class Arrays_Question8{
	public static void main(String[] args) {
		int arr1[]= {1,4,6,7,8};
		int arr2[]= {1,2,3,4,9};
		int m = arr1.length;
		int n = arr2.length;

		print_union(arr1, arr2, m, n);
		print_intersection(arr1, arr2, m,n);
	}

	public static void print_intersection(int arr1[], int arr2[], int m, int n){
		int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
	}

	public static void print_union(int arr1[], int arr2[], int m, int n){
		
        int i = 0, j = 0,count = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]){
                System.out.print(arr1[i++] + " ");
            	count++;
            }
            else if (arr2[j] < arr1[i]){
                System.out.print(arr2[j++] + " ");
            	count++;
            }
            else {
                System.out.print(arr2[j++] + " ");
                i++;
                count++;
            }
        }
 
        /* Print remaining elements of
         the larger array */
        while (i < m)
            System.out.println(arr1[i++] + " ");
        	count++;
        while (j < n)
            System.out.println(arr2[j++] + " ");
 			count++;
 			System.out.println(count);
    }
}