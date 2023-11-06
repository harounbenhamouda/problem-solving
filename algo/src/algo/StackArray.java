package algo;

public class StackArray {
 private int top;
 private int[] arr;
 public StackArray(int capacity) {
	 this.top=-1;
	 arr=new int[capacity];
 }
 

  public int size() {
     return top + 1;
  }

  public boolean isEmpty() {
     return top < 0;
  }

  public boolean isFull() {
     return arr.length == size();
  }
public void push(int value) {
	if(isFull()) {
	    throw new RuntimeException("Stack is full !!!");
	}
	top=top+1;
	arr[top]=value;
}
public void pop() {
	if(isEmpty()) {
		   throw new RuntimeException("Stack is Empty !!!");

	}
	top=top-1;
}
public static void main(String[] args) {
    StackArray stack = new StackArray(3);
    stack.push(10);
    stack.push(15);
    stack.push(20);
}
}