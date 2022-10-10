import java.util.*;
public class kadaneAlgo{
	public static void main(String[] args) {
		int a[] = {-2 ,1 ,-3, 4, -1, 2, 1, -5, 4};
		// 9
// -2 1 -3 4 -1 2 1 -5 4

		// subArray(a);
		// maxSubArray(a);
		kadanesAlgo(a);
	}

	public static void kadanesAlgo(int []a){
		int ME = Integer.MIN_VALUE;
		int MSF = 0;

		for(int i = 0; i<a.length; i++){
			MSF += a[i];
			if(ME<MSF){
				ME = MSF;
			}
			if(MSF <0){
				ME = 0;
			}
		}
		System.out.println(ME);

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