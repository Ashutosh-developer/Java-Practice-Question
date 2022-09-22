import java.util.*;

public class String_Question18{
	public static void main(String[] args) {
		
		String s = "    How   are  you   buddy     ";

		String newstr = (reverseWords(s));
		System.out.println(newstr);
	}

	public static String reverseWords(String s){
		StringBuffer sb = new StringBuffer();

        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                int j = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for (int k = i + 1; k <= j; k++) {
                    sb.append(s.charAt(k));
                }
            }
        }

        return sb.toString();
	}
}