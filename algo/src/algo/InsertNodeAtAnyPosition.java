package algo;



public class InsertNodeAtAnyPosition {
	Node1 head;
	private static class Node1{
		int value;
		 Node1 next;
	
   

    public Node1(int value ) {
        this.value = value;
        this.next = null; 
    }
}
	public void insertNode(int position,int value) {
		
		Node1 mynewnode= new Node1(10000);
		if(position==1) {
			mynewnode.next=head;
			head=mynewnode;}
		else{
			int cpt=1;
			Node1 myprevious=head;
			while(cpt<position-1) {
				cpt=cpt+1;
				myprevious=myprevious.next;
				
			
		}
			Node1 current=myprevious.next;
		myprevious.next=mynewnode;
		mynewnode.next=current;
		}
	}
	public static void main(String[] args) {
   	 InsertNodeAtAnyPosition  sl = new InsertNodeAtAnyPosition();
       sl.head = new  Node1(8);
       Node1 two = new  Node1(1);
       Node1 three = new Node1(8);
       Node1 four = new Node1(11);

       
       sl.head.next = two;
       two.next = three;
       three.next = four;
       four.next = null; 
       sl.insertNode(3,1000 );
              Node1 current =sl.head; ;
       while(current!=null) {
       	System.out.println(current.value);
       	current=current.next;
       }
   }
}

	
	

