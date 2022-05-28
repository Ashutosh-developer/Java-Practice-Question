import java.util.*;

public class Arrays_Question4{
	public static void main(String[] args) {
		int a[] = {1,2,2,1,2,0,0,0};
		int size = a.length;

		//Sorting_a(a, size);
	}
		
	public static void Sorting_a (int a[], int size){
		int zero = 0;
		int one = 0;
		int two = 0;


		for(int i = 0; i < size; i++ ){
			if(a[i] == 0){
				zero++;
			} else if(a[i] == 1){
				one++;
			} else if(a[i] == 2){
				two++;
			}
		}

		for(int i = 0; i < size; i++){
			if(zero>0){
				a[i]=0;
				zero--;
			}else if(one>0){
				a[i]=1;
				one--;
			}else if(two>0){
				a[i]=2;
				two--;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}