package algo;


public class GoogleIntgerviewProblem {
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
	    public void sumtwoList(Node a,Node b) {
	    	Node current1=head1;
	    	Node current2=head2;
	    	 StringBuilder num1 = new StringBuilder();
	    	    StringBuilder num2 = new StringBuilder();
	    	while(current1!=null&&current2!=null) {
	    		 num1.append(current1.value);
	    		 num2.append(current2.value);
	    		 if(current1==null) {
	    			 current2=current2.next;
	    		 }
	    		 else if (current2==null){
	    			 current1=current1.next;
	    			
	    		 }
	    		 else {
	    			 current2=current2.next;
	    			 current1=current1.next;

	    		 }
	    	}
	    	int intNum1 = Integer.parseInt(num1.reverse().toString());
	        int intNum2 = Integer.parseInt(num2.reverse().toString());
								        
							System.out.println(intNum1);
							int  sum = intNum1 + intNum2;
								       	    
							System.out.println(intNum2); 
	       	    	       	    String sumStr = String.valueOf(sum);

	       	   
	       	    current1 = head1;
	       	    for (char digit : sumStr.toCharArray()) {
	       	        current1.value = Character.getNumericValue(digit);
	       	        if (current1.next == null && digit != sumStr.charAt(sumStr.length() - 1)) {
	       	            Node newNode = new Node(0); // Create a new node if needed
	       	            current1.next = newNode;
	       	        }
	       	        current1 = current1.next;
	       	    }

	    }
	    public void sumTwoList2(Node a, Node b) {
	        Node head3 = new Node(0);
	        Node current3 = head3;
	        Node current1 = a;
	        Node current2 = b;
	        int carry = 0;

	        while (current1 != null || current2 != null) {
	            int aVal = (current1 != null) ? current1.value : 0;
	            int bVal = (current2 != null) ? current2.value : 0;

	            int sum = carry + aVal + bVal;
	            carry = sum / 10;
	            Node newNode = new Node(sum % 10);
	            current3.next = newNode;
	            current3 = current3.next;

	            if (current1 != null) {
	                current1 = current1.next;
	            }
	            if (current2 != null) {
	                current2 = current2.next;
	            }
	        }

	        if (carry > 0) {
	            current3.next = new Node(carry);
	        }
	        head1 = head3.next;
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
	    	GoogleIntgerviewProblem merger = new GoogleIntgerviewProblem();

	     
	        merger.addToFirstList(3);
	        merger.addToFirstList(4);
	        merger.addToFirstList(3);

	       
	        merger.addToSecondList(5);
	        merger.addToSecondList(6);
	        merger.addToSecondList(4);

	       //  merger.sumtwoList(merger.head1, merger.head2);  
	         merger.sumTwoList2(merger.head1, merger.head2);  

	       
	        System.out.println("Merged List:");
	        merger.displayMerged();
	    }

}
