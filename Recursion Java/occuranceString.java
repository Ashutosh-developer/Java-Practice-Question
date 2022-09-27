import java.util.*;

//print the first and last occurance index of the character in a string 

public class occuranceString{
	public static void main (String args[]){
		String s = "abaacdaefaah";
		findOccurance(s ,0 , 'a');
	}

	public static int first = -1;
	public static int last = -1;

	public static void findOccurance(String str, int idx, char element){

		if(idx == str.length()){
			System.out.println(first);
			System.out.println(last);
			return;
		}

		char currChar = str.charAt(idx);
		if(currChar == element){
			if(first == -1){
				first = idx;
			}else{
				last = idx;
			}
		}

		findOccurance(str, idx+1, element);
	}
}