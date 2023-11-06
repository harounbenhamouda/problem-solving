package algo;

import java.util.NoSuchElementException;

public class DoublyLinkedLust {

	private ListNode head;
	private ListNode tail;
	private int length;
private class ListNode {
	private ListNode next;
	private ListNode previous;
	private int data;
	private ListNode(int data) {
		this.data=data;	}
}

	public DoublyLinkedLust() {
	super();
	this.head = null;
	this.tail = null;
	this.length = 0;
}
	   public void displayForward() {
		      if (head == null) {
		         return;
		      }

		      ListNode temp = head;
		      while (temp != null) {
		         System.out.print(temp.data + " --> ");
		         temp = temp.next;
		      }
		      System.out.println("null");
		   }
public void insertAtThebegigining(int data) {
	ListNode newNode =new ListNode(data);
	ListNode current=head;
	if(current==null) {
		tail=newNode;
	}
	else {
		current.previous=newNode;
	}
	newNode.next=head;
	head=newNode;
}
public void insertAtTheEnd(int data) {
	ListNode newNode = new ListNode(data);
	ListNode current=tail;
	if(current==null) {
		head=newNode;
	}
	else {
		current.next=newNode;
		
	}
	newNode.previous=tail;
	tail=newNode;
}
public void deleteFirstNode() {
	ListNode current=head;
	if(current==null) {
		throw new NoSuchElementException();
	}
// te	ListNodemp=current;
	if(head==tail){
		tail=null;
	}
	else {
		current.next.previous=null;
	}
	head=head.next;
	current.next=null;
}
public void deleteLastNode() { 
	ListNode current=tail;
	if(current==null) {
		throw new NoSuchElementException();
	}
// te	ListNodemp=current;
	if(head==tail){
		tail=null;
	}
	else {
		current.previous.next=null;
	}
	tail=tail.previous;
	current.previous=null;
	
}
	public static void main(String[] args) {
		DoublyLinkedLust dll = new DoublyLinkedLust();
		/*dll.insertAtThebegigining(1);
		dll.insertAtThebegigining(1);
		dll.insertAtThebegigining(1);
		dll.insertAtThebegigining(1);*/
		dll.insertAtTheEnd(2);
		dll.insertAtTheEnd(3);
		dll.insertAtTheEnd(4);
		dll.insertAtTheEnd(5);
		//dll.deleteFirstNode();
		dll.deleteLastNode();
		dll.displayForward();
	}

}
