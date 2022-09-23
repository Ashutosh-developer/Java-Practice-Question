import java.util.*;
import java.util.LinkedList;


// Implementing Linked list through collection package.

class LinkedList1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addFirst(1);
		list.addFirst(5);
		list.addFirst(7);
		list.addFirst(3);
		list.addFirst(8);
		list.addFirst(2);
		list.addFirst(3);


		System.out.println(list);

		System.out.println(list.indexOf(7));
	} 
}