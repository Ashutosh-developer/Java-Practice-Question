import java.util.*;

public class LinkedList2 {
	
	class Node {
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	Node tail;
	int size = 0;	

	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		list.addAtHead(40);
		list.addAtHead(30);
		list.addAtHead(20);
		list.addAtHead(10);

		// list.display();

		// System.out.println("------------------");

		// list.addAtTail(50);
		list.display();

		// System.out.println(list.size);
		
		// System.out.println("------------------");

		// Testing getAt function
		// int val = list.getAt(2);
		// System.out.println(val);

		System.out.println("------------------");

		// Testing -> addition of node at a particular location

		list.addAtMid(70);
		list.display();

	}

	// Addition of Node at head

	public void addAtHead(int data){
		Node node = new Node(data);

		if(this.head == null){
			this.head = node;
			this.tail = node;
			this.size++;
			return;
		}

		node.next = this.head;
		this.head = node;
		this.size++;		

	}


	// Addition of Node at last

	public void addAtTail(int data){
		Node node = new Node(data);

		if(head == null){
			this.addAtHead(data);
			return;
		}

		this.tail.next = node;
		this.tail = node;
		this.size++;
	}



	public void addAtlocation(int data, int location){

		if(location == 1){
			this.addAtHead(data);
			return;
		}

		if(location == this.size){
			this.addAtTail(data);
		}

		Node prev = getAtNode(location-1);
		Node node = new Node(data);

		node.next = prev.next;
		prev.next = node;
		this.size++;


	}


	// Adding node at mid 

	public void addAtMid(int data){
		int mid = (size/2);

		Node prev = getAtNode(mid);
		Node node = new Node(data);

		node.next = prev.next;
		prev.next = node;
		this.size++;
	}



	// Get Node data at a location -> 1 based index 
	public int getAt(int location){

		if(this.head == null){
			return -1;
		}

		if(location > this.size || location < 1){
			return -1;
		}

		int counter = 1;
		Node temp = this.head;
		while(temp != null && counter != location){
			counter++;
			temp = temp.next;
		}

		return temp.data;

	}


	// Get Node at a location -> 1 based index 
	public Node getAtNode(int location){

		if(this.head == null){
			return null;
		}

		if(location > this.size || location < 1){
			return null;
		}

		int counter = 1;
		Node temp = this.head;
		while(temp != null && counter != location){
			counter++;
			temp = temp.next;
		}

		return temp;

	}

	// Traversing of a linkedList ---> O(N)

	public void display(){
		Node temp = head;

		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}