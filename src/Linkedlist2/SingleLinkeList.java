package Linkedlist2;

public class SingleLinkeList {
	Node head;

	public void insertFirst(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}

	public void printNodeElement() {
		Node node = head;
		System.out.println(" Linked List Element ");

		while (node.next != null) {
			node.display();
			node = node.next;
		}
	}
}
