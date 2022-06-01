import java.util.*;

class Arrays_Question6{
	public static void main(String[] args) {
		int arr_1[] = {85,25,1,32,54,6};
		int arr_2[] = {85,2};
		int temp = unioncount(arr_2, arr_1);
		System.out.println(temp);
	}

	public static int unioncount(int arr_1[], int arr_2[]){
		HashMap<Integer, Integer> map = new HashMap<>();

		int n = arr_1.length;
		int m = arr_2.length;
		int count = 0;

		for(int i = 0; i<n; i++){
			if(!map.containsKey(arr_1[i])){
				map.put(arr_1[i],1);
				count++;
			}

		}
		for(int i = 0; i<m; i++){
			if(!map.containsKey(arr_2[i])){
				map.put(arr_2[i],1);
				count++;
			}
		}
		return count;
	}
	
}