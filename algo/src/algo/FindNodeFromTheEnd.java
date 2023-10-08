package algo;



public class FindNodeFromTheEnd {
    Node1 head;

    private static class Node1 {
        int value;
        Node1 next;

        public Node1(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void findNode(int position) {
        Node1 current = head;
        int cpt=0;
        int mylegth=0;     
        
       int myvalue=0;
        
        while (current != null) {
            
            current = current.next;
            mylegth++;
        } 
Node1 current2=head;
while(current2!=null) {
	if(cpt==(mylegth-position-1)) {
		myvalue=current2.value;
		break;
	}
	current2=current2.next;
	cpt=cpt+1;
}
     System.out.println("the founeded value"+myvalue);
    }
public void anotherWay(int position) {
	Node1 fastCouter=head;
	Node1 RealCouter=head;
	int cpt=0;
	while(cpt<position) {
		fastCouter=fastCouter.next;
		cpt++;
	}
	while(fastCouter.next!=null) {
		fastCouter=fastCouter.next;
		RealCouter=RealCouter.next;
	}
        System.out.println("my value is "+RealCouter.value);	
}
    public static void main(String[] args) {
    	 FindNodeFromTheEnd sl = new  FindNodeFromTheEnd();
        sl.head = new Node1(1);
        Node1 two = new Node1(2);
        Node1 three = new Node1(3);
        Node1 four = new Node1(4);

        sl.head.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        sl.findNode(1);
         sl.anotherWay(1);
        Node1 current = sl.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

}
