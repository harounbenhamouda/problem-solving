package algo;

import java.util.NoSuchElementException;

public class Queue {
private ListNode rear;
private ListNode front;
private int length;


public static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		data=data;
		next=null;
	}
}
public Queue() {
    front = null;
    rear = null;
    length = 0;
 }

 public int length() {
    return length;
 }

 public boolean isEmpty() {
    return length == 0;
 }
 public void enqueue(int data) {
	 ListNode temp =new ListNode(data);
	 if(isEmpty()) {
		 front=temp;
	 
 }
	 else {
		 rear.next=temp;
	 }
	 rear=temp;
	 length++;
}
 public void  dequeue() {
	 if(isEmpty()) {
		 throw new NoSuchElementException("quue is already empty");
	 }
	 ListNode temp=front;
	 front=front.next;
	 temp.next=null;
	 if(front==null) {
		 rear=null;
	 }
	 length--;
 }
 public void print() {
     if (isEmpty()) {
        return;
     }

     ListNode current = front;
     while (current != null) {
        System.out.print(current.data + " --> ");
        current = current.next;
     }
     System.out.println("null");
  }

  public static void main(String[] args) {
     Queue queue = new Queue();
     queue.enqueue(10);
     queue.enqueue(15);
     queue.enqueue(20);

     queue.print();

     queue.dequeue();
     queue.dequeue();

     queue.print();
  }
}
