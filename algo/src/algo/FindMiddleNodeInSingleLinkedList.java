package algo;


public class FindMiddleNodeInSingleLinkedList {
	Node1 head;

    private static class Node1 {
        int value;
        Node1 next;

        public Node1(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node1 findmiddleNode() {
        //Node1 current = head;
        Node1 slowPointetr = head;
        Node1 fastPointer = head;
        
        while (fastPointer!=null && fastPointer.next!=null ) {
        	slowPointetr=slowPointetr.next;
        	
            fastPointer=fastPointer.next.next;
        }
       System.out.println(slowPointetr.value);
        return slowPointetr;
    }

    public static void main(String[] args) {
        FindMiddleNodeInSingleLinkedList sl = new FindMiddleNodeInSingleLinkedList();
        sl.head = new Node1(1);
        Node1 two = new Node1(2);
        Node1 three = new Node1(3);
        Node1 four = new Node1(4);

        sl.head.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        sl.findmiddleNode();;

        Node1 current = sl.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

}
