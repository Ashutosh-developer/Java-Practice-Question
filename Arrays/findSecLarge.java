// import java.util.*;

class findSecLarge{
	public static void main(String[] args) {
	
	int arr[] = {12,35,1,10,23,34,1};
	int n = arr.length;

	findSecondlargest(arr, n);	
	
	}

	public static void findSecondlargest(int arr[], int n){

		int i, second;
 
 
    int largest = second = Integer.MIN_VALUE;
 
    // Find the largest element
    for(i = 0; i < n; i++)
    {
        largest = Math.max(largest, arr[i]);
    }
 
    // Find the second largest element
    for(i = 0; i < n; i++)
    {
        if (arr[i] != largest)
            second = Math.max(second, arr[i]);
    }
    if (second == Integer.MIN_VALUE)
        System.out.printf("There is no second " +
                          "largest element\n");
    else
        System.out.printf("The second largest " +
                          "element is %d\n", second);}

}