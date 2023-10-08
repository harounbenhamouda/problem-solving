package algo;

public class MergeTwoLinkedLists {
    private Node head1;
    private Node head2;

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void addToFirstList(int value) {
        Node newNode = new Node(value);
        if (head1 == null) {
            head1 = newNode;
        } else {
            Node current = head1;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addToSecondList(int value) {
        Node newNode = new Node(value);
        if (head2 == null) {
            head2 = newNode;
        } else {
            Node current = head2;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void mergeLists() {
        Node current1 = head1;
        Node current2 = head2;
        Node prev = null;

        while (current1 != null && current2 != null) {
            if (current1.value < current2.value) {
                prev = current1;
                current1 = current1.next;
            } else {
                Node next2 = current2.next;
                current2.next = current1;
                		if(prev==null) {
                			head1=current2;
                								}
                		else {
                            prev.next = current2;
                        }

                    
                

                prev = current2;
                current2 = next2;
            }
        }

        
    }

    public void displayMerged() {
        Node current = head1;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoLinkedLists merger = new MergeTwoLinkedLists();

     
        merger.addToFirstList(3);
        merger.addToFirstList(3);
        merger.addToFirstList(5);

       
        merger.addToSecondList(2);
        merger.addToSecondList(4);

        
        merger.mergeLists();

       
        System.out.println("Merged List:");
        merger.displayMerged();
    }
}
