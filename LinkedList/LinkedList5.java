import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList5{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(23);
		list.add(42);
		list.add(26);
		list.add(53);
		list.add(10);
		list.add(61);
		list.add(15);
		list.add(72);
		list.add(12);

		System.out.println(list.size());

		// System.out.println(list.listIterator(0));

		System.out.println(list.element());
	}	
}