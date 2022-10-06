import java.util.*;
public class sortArr{

	//is array sorted via for loop 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];
		boolean isAccending = true;

		for(int i = 0; i<t; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				isAccending = false;
			}
		}

		if(isAccending){
			System.out.println("The input array is sorted");
		}else{
			System.out.println("The array is not sorted");
		}
	}
}