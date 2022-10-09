import java.util.*;
public class rotANo{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		rotateANo(arr);
	}

	public static void rotateANo(int arr[]){
		int a = arr[arr.length-1], i;

		for(i = arr.length-1; i>0; i--){ 
			arr[i] = arr[i-1];
		}
			arr[0] = a;

			System.out.println(Arrays.toString(arr));
	}
}