import java.util.*;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList3 driver = new LinkedList3();
		LinkedList2 list = new LinkedList2();
		list.addAtHead(1);
		list.addAtTail(2);
		list.addAtTail(3);
		list.addAtTail(4);

		list.display();

		System.out.println("----------------------------");

		Node temp = list.head;


		// driver.reverseIterative(list);
		driver.reverseRecursive(null, temp, list);
		// System.out.println(list.head);

		list.display();
	}

	// Reverse a linkedList with Iterative aproach

	public void reverseIterative(LinkedList2 list){

		if(list.head == null || list.size < 2){
			return;
		}

		Node prev = null;
		Node curr = list.head;

		while(curr != null){
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}

		list.tail = list.head;
		list.head = prev;

	}


	// Reverse a linked list with Recursive aproach
	public void reverseRecursive(Node prev, Node curr, LinkedList2 list){
		if(curr == null){
			list.tail = list.head;
			list.head = prev;
			return;
		}

		Node nextNode = curr.next;
		curr.next = prev;
		prev = curr;
		curr = nextNode;

		reverseRecursive(prev, curr, list);
	}
}