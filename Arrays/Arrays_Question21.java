import java.util.*;
public class Arrays_Question21{
	public static void main(String[] args) {
	//move zeroes to the end of the array
	int arr[] = {4,5,0,1,9,0,5,0};
	int i = 0;
	int j = arr.length-1;
	int temp = 0;

	while(i <= j){
		if(arr[i]==0){
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			j--;
		}else{
			i++;
		}
	}	System.out.println(Arrays.toString(arr));
	}
	
}