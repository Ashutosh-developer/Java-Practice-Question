import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
class Arrays_Question26 {
   public static void main(String args[] ) throws Exception {
      Scanner scanner = new Scanner(System.in);
       int numTestcases = scanner.nextInt();
       for (int i = 0; i < numTestcases; i++) {
           int arLength = scanner.nextInt();
           int numRotations = scanner.nextInt();
           numRotations = numRotations % arLength;
           scanner.nextLine();

           String inputString = scanner.nextLine();
           String[] inputStringArray = inputString.split(" ");

           StringBuffer sb = new StringBuffer();
           for (int j = 0;  j < arLength; j++) {
               sb.append( inputStringArray[ (arLength + j - numRotations) % arLength ] + " " );
           }
           System.out.print(sb);
           System.out.println("");
       }
   }   

}