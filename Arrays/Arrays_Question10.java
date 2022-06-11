import java.util.*;
public class Arrays_Question10{
	public static void main(String[] args) {
		int a[] = {1,2,3,-2,5};
		subArray(a);
		maxSubArray(a);
	}

	public static void subArray(int a[]){

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<a.length; i++){
			for(int j = i; j<a.length; j++){
				list.add(a[j]);
				System.out.println(list);
			}
			list.clear();
		}
	}
	public static void maxSubArray(int a[]){

		ArrayList<Integer> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<a.length; i++){
			int current=0;
			for(int j = i; j<a.length; j++){
				current += a[j];
				if(current> max){
					max = current;
				}
				list.add(a[j]);
				// System.out.println(list);
			}
			list.clear();
		}

		System.out.println(max);
		
	}
}