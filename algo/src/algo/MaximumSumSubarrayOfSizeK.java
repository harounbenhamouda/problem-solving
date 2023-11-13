package algo;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumSumSubarrayOfSizeK {
	public static int maximumSumSubarrayOfSizeK(int [] tab,int k) {
		int n=tab.length;
		int sum=0;
		int result;
		Deque<Integer> deq= new ArrayDeque();
		for(int i=0;i<n;i++) {
			
			sum+=tab[i];
			while(!deq.isEmpty()&& deq.peek()<sum) {
				deq.poll();
			}
			if(i>=k-1) {
				deq.push(sum);
				sum=sum-tab[i-k+1];
				
			}
			

		
		}
		return result=deq.poll();
	}
	
}
