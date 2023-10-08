package algo;

public class DetectLoopInLinkedList {
	 private ListNode head;

	   private static class ListNode {
	      private int data; // Can be a generic type
	      private ListNode next; // Reference to next ListNode in list

	      public ListNode(int data) {
	         this.data = data;
	         this.next = null;
	      }
	   }
	   public void RemoveLoop() {
		      ListNode fastPtr = head;
		      ListNode slowPtr = head;

		      while ( fastPtr ==slowPtr.next) {
		    	  
		         fastPtr = fastPtr.next.next;
		         slowPtr = slowPtr.next;

		       
		      }
		    
		        	 slowPtr.next=null;
		            		        
		   }
	   
	 
	   
	   
	   public void createALoopInLinkedList() {
		      ListNode first = new ListNode(1);
		      ListNode second = new ListNode(2);
		      ListNode third = new ListNode(3);
		      ListNode fourth = new ListNode(4);
		      ListNode fifth = new ListNode(5);
		      ListNode sixth = new ListNode(6);

		      head = first;
		      first.next = second;
		      second.next = third;
		      third.next = fourth;
		      fourth.next = fifth;
		      fifth.next = sixth;
		      sixth.next = third;
		   }
	   public void display() {
		      ListNode current = head;
		      int cpt=0;
		      while (current != null|| cpt<16) {
		         System.out.print(current.data + " --> ");
		         current = current.next;
		          cpt++;
		      }
		      System.out.print("null");
		      System.out.println();
		   }  
	   
	   
	   
	   

	   public static void main(String[] args) {
		   DetectLoopInLinkedList sll1 = new DetectLoopInLinkedList();
	      sll1.createALoopInLinkedList();	     
	      		sll1.RemoveLoop();
	     
	      

	     sll1.display();
	   }

	
}
