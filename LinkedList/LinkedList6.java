import java.util.LinkedList; 
import java.util.*;
import java.util.Collections;
public class LinkedList6{
       public static void main(String[] args) {
       List<Integer> list2 =new LinkedList();
       list2.add(18);
       list2.add(23);
       list2.add(13);
       list2.add(39);
       list2.add(63);
       list2.add(33);
       list2.add(36);

       System.out.println(list2);
       
       Collections.reverse(list2);

       System.out.println(list2);

       }
}