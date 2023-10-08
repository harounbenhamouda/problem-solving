package algo;



public class InsertNodeInSortedLinkedList {

	Node1 head;

    private static class Node1 {
        int value;
        Node1 next;

        public Node1(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insertNode(int value) {
        Node1 current = head;
        Node1 newnode = new Node1(value);

        if (head == null || newnode.value < head.value) {
            newnode.next = current;
            head = newnode;
        } else {
            while (current != null) {
                if (current.next == null || newnode.value < current.next.value) {
                    newnode.next = current.next;
                    current.next = newnode;
                    break; // Break out of the loop after inserting the node
                }
                current = current.next;
            }
        }
    }


    public static void main(String[] args) {
        InsertNodeInSortedLinkedList sl = new InsertNodeInSortedLinkedList();
        sl.head = new Node1(1);
        Node1 two = new Node1(2);
        Node1 three = new Node1(6);
        Node1 four = new Node1(4);

        sl.head.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        sl.insertNode(0);;

        Node1 current = sl.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

}

