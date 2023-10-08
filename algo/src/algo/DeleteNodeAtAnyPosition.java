package algo;



public class DeleteNodeAtAnyPosition {
	Node1 head;
	private static class Node1{
		int value;
		 Node1 next;
	
   

    public Node1(int value ) {
        this.value = value;
        this.next = null; 
    }
}
	public void DeleteAtAnyPositionNode(int position) {
		
		Node1 current =head;
		Node1 previous=null;
		int cpt=1;
		if(position==1) {
			head=head.next;
		}
		else {
		while(cpt <position) {
			previous=current;
			current=current.next;
			cpt=cpt+1;
		}
	previous.next=current.next;}
	}
	public static void main(String[] args) {
   	 DeleteNodeAtAnyPosition  sl = new DeleteNodeAtAnyPosition();
       sl.head = new  Node1(8);
       Node1 two = new  Node1(1);
       Node1 three = new Node1(8);
       Node1 four = new Node1(11);

       
       sl.head.next = two;
       two.next = three;
       three.next = four;
       four.next = null; 
       sl.DeleteAtAnyPositionNode(1);
       
                    Node1 current =sl.head; ;
       while(current!=null) {
       	System.out.println(current.value);
       	current=current.next;
       }
   }

}
