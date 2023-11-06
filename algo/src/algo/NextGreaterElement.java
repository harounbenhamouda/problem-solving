package algo;

import java.util.Stack;
import java.util.Stack;
public class NextGreaterElement {
 public static int[] nextElemen(int[]arr) {
	int[] newarr= new int [arr.length];
	Stack<Integer> stack = new Stack<>();
	for(int i=arr.length-1;i>=0;i--) {
		if(!stack.isEmpty()) {
		while(!stack.isEmpty()&& stack.peek()<=arr[i]) {
			stack.pop()	;		
		}}
		if(stack.isEmpty()) {
			newarr[i]=-1;
		}
		else {
		newarr[i]=stack.peek();
		}
		stack.push(arr[i]);
	}
	return newarr;
 }
 public static void main(String[] args) {
	 int[] arr = {4, 7, 3, 4, 8, 1}; 
     int[] result = nextElemen(arr);
     for (int i : result) {
         System.out.print(i + " ");
     }
 }
}