public class plusone{
	public static void main(String[] args) {
		int digits[] = {9,9,9};
		plusOne(digits);
		for(int i = 0; i < digits.length; i++){
			System.out.print(digits[i]);
		}
	}

	public static int [] plusOne(int[] digits){
		int carry =1;
		for(int i = digits.length-1; i >= 0; i--){
			int curr = digits[i] + carry;
			if(curr >= 10){
				carry = 1;
				digits[i] = curr%10;
			}else{
				carry = 0;
				digits[i] = curr;
			}
		}
		if(carry == 1){
			int [] newDigits = new int[digits.length+1];
			newDigits[0] = 1;
			return newDigits;
		}

		return digits;
	}
}