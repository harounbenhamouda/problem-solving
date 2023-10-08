package algo;

public class SingleList {
	Node1 head;
	private static class Node1{
		int value;
		 Node1 next;
	
   

    public Node1(int value ) {
        this.value = value;
        this.next = null; 
    }
}
	public void insert(int value) {
		Node1 one=new Node1(value);
		one.next=head;
		head=one;
		
		
	}
	public void insertAtTheEnd(int value) {
		 

		Node1 current =head; ;
        while(current.next!=null) {
        	
        	current=current.next;}
        if(current.next==null) {
        	Node1 endone=new Node1(value);
    		current.next=endone;
    		endone.next=null;}
        
	}
    public static void main(String[] args) {
    	 SingleList  sl = new SingleList();
        sl.head = new  Node1(8);
        Node1 two = new  Node1(1);
        Node1 three = new Node1(8);
        Node1 four = new Node1(11);

        
        sl.head.next = two;
        two.next = three;
        three.next = four;
        four.next = null; 
        sl.insert(0);
        sl.insertAtTheEnd(100);
        Node1 current =sl.head; ;
        while(current!=null) {
        	System.out.println(current.value);
        	current=current.next;
        }
    }
}

