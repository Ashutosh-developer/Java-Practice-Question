import java.util.*;
import java.util.LinkedList;


// Implementing Linked list through collection package.

class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		LinkedList1 l = new LinkedList1();
		l.disp(list);

		list.removeFirst();



	
	}

	public void reverseList(LinkedList list){
		Node curr = this.head;
		Node prev = null;
		Node next = null;

		
	}

	public void disp(LinkedList list){
			// System.out.println(list.toArray());	
		// System.out.println("LinkedList: "+ list);
         
        //Convert LinkedList into an Array the method has no parameter
        Object[] a = list.toArray();
       
        //Print all elements of the Array
        // System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
            System.out.println(element+" ");
		}
		
}