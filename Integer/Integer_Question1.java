import java.util.*;

class Integer_Question1{
	public static void main(String[] args) {
		int n = 15;

		// fizz(n);
		buzz(n);
	}

	public static void buzz(int n){
		List<String> list = new ArrayList<>();

		for(int i = 1; i <= n; i++){
			if(i % 3 == 0 && i % 5 == 0){
				list.add("FizzBuzz");
			}else if(i % 3 == 0){
				list.add("Fizz");
			}else if(i % 5 == 0){
				list.add("Buzz");
			}else{
				list.add(Integer.toString(i));
			}
		}

			for(int i=0;i<list.size();i++){
				System.out.print(list.get(i));
			}
	}

	public static void fizz(int n){
		String str = "";

		for(int i = 1; i <= n; i++){
			if(i % 3 == 0 && i % 5 == 0){
				str += "FizzBuzz ";
			}else if(i % 3 == 0){
				str += "Fizz ";
			}
			else if(i % 5 == 0){
				str += "Buzz ";
			}
			else{
				str += Integer.toString(i);
			}
		}
		System.out.print(str);
	}
}