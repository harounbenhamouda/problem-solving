package algo;



public class RemoveKeyFromLinkedList {
	Node1 head;
	private static class Node1{
		int value;
		 Node1 next;
	
   

    public Node1(int value ) {
        this.value = value;
        this.next = null; 
    }
}
	 public void removeKey(int key) {
	        Node1 current = head;

	        if (head != null && head.value == key) {
	            head = current.next;
	        } else {
	            Node1 previous = null;
	            while (current != null) {
	                if (current.value == key) {
	                    previous.next = current.next;
	                    break;
	                }
	                previous = current;
	                current = current.next;
	            }
	        }
	    }
	public static void main(String[] args) {
   	 RemoveKeyFromLinkedList  sl = new RemoveKeyFromLinkedList();
       sl.head = new  Node1(1);
       Node1 two = new  Node1(5);
       Node1 three = new Node1(6);
       Node1 four = new Node1(4);

       
       sl.head.next = two;
       two.next = three;
       three.next = four;
       four.next = null; 
       sl.removeKey(1);
              Node1 current =sl.head; ;
       while(current!=null) {
       	System.out.println(current.value);
       	current=current.next;
       }
   }
}

	
	


