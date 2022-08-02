// import java.util.*;
class Strings_Question2{
	public static void main(String [] args) {
		String str = "abcba";

		isPalindrome(str);

		if (isPalindrome(str))
 
            // It is a palindrome
            System.out.print("Yes");
        else
 
            // Not a palindrome
            System.out.print("No");
	}

	static boolean isPalindrome(String str){
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        return true;
    }
}