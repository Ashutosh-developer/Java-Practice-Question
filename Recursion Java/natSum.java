public class natSum{
	public static void printSum(int i, int n, int sum){
		if(i==n){
			sum += i;
			System.out.println(sum);
			return;
		}

		sum += i;
		printSum(i+1,n,sum);
	}

	public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

	public static void main(String[] args) {
		int n = 6;
		printSum(1, n, 0);
		System.out.println(addNumbers(n));
	}
}