// Java program to Reverse a String by
// converting string to characters one
// by one
import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class String_Question1 {
	public static void main(String[] args)
	{
		String input = "GeeksForGeeks";

		//reverseString1(input);
		reverseString2(input);
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
