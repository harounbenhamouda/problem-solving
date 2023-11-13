package algo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Solution {
    public static long maximumSubarraySum(int[] tab, int k) {
        int n = tab.length;
        Deque<Integer> deq = new ArrayDeque<>();
        long sum = 0;
        long max = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hashmap.containsKey(tab[i])) {
                int start = hashmap.get(tab[i]) + 1;
                while (!deq.isEmpty() && deq.peek() < start) {
                    sum -= tab[deq.poll()];
                }
            }
            sum += tab[i];
            deq.offer(i);
            hashmap.put(tab[i], i);

            if (deq.size() == k) {
                max = Math.max(max, sum);
                sum -= tab[deq.poll()];
            }
        }

        return max;
    }
public static void main(String args[]) {
	int[] nums = {1, 1, 1, 7, 8, 9};
	int k = 3;
	long result = maximumSubarraySum(nums, k);
	System.out.println(result);  // Expected Output: 11

}
}
