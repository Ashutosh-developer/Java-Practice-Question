// import java.util.*;
class String_Question4{
	public static void main (String args[]){
		String s1 = "ABCD";
		String s2 = "CDAB";

		 if (checkRotations(s1, s2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
	}

	public static boolean checkRotations(String s1, String s2 )
    {

    	//here we are first comparing the length of the string and then,
    	//joining s1 two times and then checking the elements are present or not
        return (s1.length() == s2.length()) &&
               ((s1 + s1).indexOf(s2) != -1);
    }
}