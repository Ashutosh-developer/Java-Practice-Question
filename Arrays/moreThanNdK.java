import java.util.*;
public class moreThanNdK{
	public static void main(String args[]){
		int arr[] = {3,1,2,2,1,3,3,2};
		int n = arr.length-1;
		int k = 4;
		morethanNdK(arr,n,k);
	}

	public static void morethanNdK(int arr[], int n, int k){
		int x = n/k;

		HashMap<Integer,Integer> y= new HashMap<>();

		for(int i = 0; i<n; i++){
			if(!y.containsKey(arr[i])){
				y.put(arr[i],1);
			}else{
				int count = y.get(arr[i]);
				y.put(arr[i],count+1);
			}
		}

		for(Map.Entry m : y.entrySet()){

			Integer temp = (Integer)m.getValue();
			if(temp > x ){
				System.out.println(m.getKey());
			}
		}
	}
}