package algo;

public class ReverseLinkedList {
    Node1 head;

    private static class Node1 {
        int value;
        Node1 next;

        public Node1(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void reverseList() {
        Node1 current = head;
        Node1 previous = null;
        Node1 next = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous; 
    }

    public static void main(String[] args) {
        ReverseLinkedList sl = new ReverseLinkedList();
        sl.head = new Node1(1);
        Node1 two = new Node1(2);
        Node1 three = new Node1(3);
        Node1 four = new Node1(4);

        sl.head.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        sl.reverseList();

        Node1 current = sl.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
