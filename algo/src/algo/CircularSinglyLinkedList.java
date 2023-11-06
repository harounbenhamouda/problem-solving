package algo;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    ListNode last;
    int length;
   public static class ListNode{
	    private int value;
	    private ListNode next;
	    public ListNode(int value) {
	    	this.value=value;
	    }}
	    public void  circularSinglyLinkedList() {
	    	last=null;
	    	length=0;
	    }
	    public int length() {
	        return length;
	     }
	    public void insertAtTheBegining(int data ) {
	    	ListNode newNode = new ListNode(data);
	    	// current=last;
	    	if(last==null) {
	    		last=newNode;
	    	}
	    	else {
	    		newNode.next=last.next;
	    	}
	    	last.next=newNode;
	    }
	    public void InsertAtTheEnd(int data) {
	    	ListNode newNode=new ListNode(data);
	    	//ListNode head;
	    	if(last==null) {
	    		last=newNode;
	    		last.next=last;
	    		
	    	}
	    	else {
	    		newNode.next=last.next;
	    		last.next=newNode;
	    		
	    		last=newNode;
	    	}
	    	
	    	//last.next=newNode;
	    }
	    public void deleteAtFirst() {
	    	if(last==null) {
	    	throw new NoSuchElementException();
	    	}
	    	ListNode head=last.next;
	    	if(head==last) {
	    		last=null;
	    	}
	    	else {last.next=head.next;
	    head.next=null;}
	    }
   public void printCircularList() {
	   if (last == null) {
	         return;
	      }

	      ListNode first = last.next;
	      while (first != last) {
	         System.out.print(first.value + " --> ");
	         first = first.next;
	      }
	      System.out.println(first.value);
   }
	public static void main(String[] args) {
		CircularSinglyLinkedList csl= new CircularSinglyLinkedList();
		/*csl.insertAtTheBegining(1);
		csl.insertAtTheBegining(1);
		csl.insertAtTheBegining(2);
		csl.insertAtTheBegining(3);*/
		csl.InsertAtTheEnd(0);
		csl.InsertAtTheEnd(1);
		csl.InsertAtTheEnd(2);
		csl.InsertAtTheEnd(3);
csl.deleteAtFirst();
		csl.printCircularList();
	}

}
