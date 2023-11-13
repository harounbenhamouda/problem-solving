package algo;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SlidingWindowMaximum {
	public static int[] maxSlidingWindow(int[] tab, int k) {
	    int n = tab.length;

	    
	    if (k >= n) {
	        int max = Integer.MIN_VALUE;
	        for (int value : tab) {
	            max = Math.max(max, value);
	        }
	        return new int[]{max};
	    }

	    int cpt = n - k + 1;
	    int j = 0;
	    final int maxmin = Integer.MIN_VALUE;
	    int max = maxmin;

	    int[] result = new int[cpt];

	    for (int i = 0; i < n; i++) {
	        if (max <= tab[i]) {
	            max = tab[i];
	        }

	        
	        if (i - j + 1 == k) {
	            result[j] = max;
	            i = j;
	            j++;
	            max = maxmin;
	        }
	    }

	    return result;
	}
	public static int[] maxSlidingWindow2(int[] tab, int k) {
	    int n = tab.length;

	    
	    
	    int cpt = n - k + 1;
	    Deque<Integer> deque = new ArrayDeque<>();
	     

	    int[] result = new int[cpt];

	    for(int i=0;i<n;i++) {
	    	while(!deque.isEmpty()&& deque.peek()<i-k+1) {
	    		deque.poll();
	    	}
	    	while(!deque.isEmpty()&& tab[deque.peek()]<tab[i]) {
	    		deque.pollFirst();
	    	}
	    	deque.offer(i);
	    	if(i>=k-1) {
	    		result[i-k+1]=tab[deque.peek()];
	    	}
	    }
	    return result;
	}

    public static void main(String args[]) {
        int[] tab = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = maxSlidingWindow(tab, k);
        int[] result1 = maxSlidingWindow2(tab, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println("t->" + result[i]);
            System.out.println("solution2->" + result1[i]);
        }
    }
}
