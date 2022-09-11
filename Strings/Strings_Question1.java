/*Java program to Reverse a String by
converting string to characters one
by one */

// Class of ReverseString

class String_Question1{
	public static void main(String[] args){

		String input1 = "GeeksForGeeks";

		//reverseString1(input);
		//reverseString2(input);
		reverseString3(input1);
	}


	public static void reverseString3(String input1){
		char[] cArray = input1.toCharArray();
		StringBuilder tempS = new StringBuilder();
		//String result = "";

		for(int i = 0; i < cArray.length; i++){
			if(cArray[i] != ' '){
				if(i == cArray.length-1){
					tempS.append(String.valueOf(cArray[i]).toUpperCase());
				}
				else if(cArray[i+1] == ' '){
					tempS.append(String.valueOf(cArray[i]).toUpperCase());
				}else{
					tempS.append(String.valueOf(cArray[i]).toUpperCase());
				}
			}
			else{
				tempS.reverse();
				//result += tempS;
				tempS.append("");
			}
		}
		System.out.println(tempS);
	}

	public static void reverseString2(String input){
		String nstr = "";
		char ch;
       
      System.out.print("Original word: ");
      System.out.println(input); //Example word
       
      for (int i=0; i<input.length(); i++)
      {
        ch= input.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
	}

	public static void reverseString1(String input ){
		// convert String to character array
		// by using toCharArray
		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
