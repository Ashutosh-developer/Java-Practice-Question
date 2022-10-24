class printXpowN{
	public static void main(String[] args) {
		int x = 2, n = 4;
		int ans = calcPower1(x,n);
		System.out.println(ans);
	}


	public static int calcPower1(int x, int n){
		if(n==0){
			return 1;
		}

		if(x == 0){
			return 0;
		}

		//if n is even
		if(n % 2 == 0){
			return calcPower1(x,n/2) * calcPower1(x,n/2);
		}else{
			//n is odd
			return calcPower1(x,n/2) * calcPower1(x,n/2) * x;
		}
	}
	public static int calcPower(int x, int n){
		if(n == 0){
			return 1;
		}

		if(x==0){
			return 0;
		}

		int xPownm1 = calcPower(x, n-1);
		int xPown = x * xPownm1;
		return xPown;
	}
}