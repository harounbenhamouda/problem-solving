package algo;



public class DeleteAtThend {
	Node1 head;
	private static class Node1{
		int value;
		 Node1 next;
	
   

    public Node1(int value ) {
        this.value = value;
        this.next = null; 
    }
}
	public void DeleteLastNode() {
		
		Node1 current =head;
		Node1 previous=null;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;
	}
	public static void main(String[] args) {
   	 DeleteAtThend  sl = new DeleteAtThend();
       sl.head = new  Node1(8);
       Node1 two = new  Node1(1);
       Node1 three = new Node1(8);
       Node1 four = new Node1(11);

       
       sl.head.next = two;
       two.next = three;
       three.next = four;
       four.next = null; 
       sl.DeleteLastNode();
       
                    Node1 current =sl.head; ;
       while(current!=null) {
       	System.out.println(current.value);
       	current=current.next;
       }
   }



}
