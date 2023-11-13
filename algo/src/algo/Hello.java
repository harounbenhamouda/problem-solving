package algo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hello {
	
	
	    public static int[] slidingWindowMaximum(int[] tab, int k) {
	        int n = tab.length;
	        int cpt = n - k + 1;
	        int[] result = new int[cpt];
	        Deque<Integer> deque = new ArrayDeque<>();
	        int max = Integer.MIN_VALUE;
	        // Pre-fill the deque with all indices
	        for (int i = 0; i < n; i++) {
	            deque.offer(i);
	        }

	        int j = 0;

	        for (int i = 1; i < n; i++) {
	            while (!deque.isEmpty() && deque.peek() < i - k+1) {

	            		
	                if (tab[deque.peek()] <= tab[i]) {
	                    max = tab[i];}
	                else {
	                	 max = tab[deque.peek()];
	                }
	                deque.poll();
	            }if (i - j + 1 == k) {
		            result[j] = max;
		            j++;  
		            i = j;
	        }}
	           
	        
	        return result;
	    }
public static void main(String args[]) {
    int[] tab = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    int[] result = slidingWindowMaximum(tab, k);

    for (int i = 0; i < result.length; i++) {
        System.out.println("t->" + result[i]);
    }
}}