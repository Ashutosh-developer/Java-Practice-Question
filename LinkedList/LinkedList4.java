import java.util.*;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList4 driver = new LinkedList4();
		LinkedList2 list = new LinkedList2();
		list.addAtHead(1);
		list.addAtTail(2);
		list.addAtTail(1);
		list.addAtTail(2);
		list.addAtTail(3);

		list.display();

		System.out.println("-------------------------------");

		//driver.removeDuplicate(list);
		driver.removeDuplicateFromUnsorted(list);
		list.display();

	}

	// Remove duplicate data node from sorted linked list

	public void removeDuplicate(LinkedList2 list){
		Node curr = list.head;

		while(curr != null){
			Node nextNode = curr.next;

			if(nextNode != null && curr.data == nextNode.data){
				curr.next = nextNode.next;
				nextNode.next = null;
			}

			curr = curr.next;
		}
	}

	// Remove data from unsorted linked list

	public void removeDuplicateFromUnsorted(LinkedList2 list){
		Node curr = list.head;

		while(curr != null){
			Node nextNode = curr.next;
			Node prev = curr;

			while(nextNode != null){
				if(nextNode.data == curr.data){
					prev.next = nextNode.next;
					nextNode.next = null;
				}

				prev = nextNode;
				nextNode= nextNode.next;
			}

			curr = curr.next;
		}
	}
}