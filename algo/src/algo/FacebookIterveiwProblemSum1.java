package algo;

import java.util.HashMap;

public class FacebookIterveiwProblemSum1 {
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap=new HashMap<>();
	int[]result=new int[2];
	for(int i =0;i<nums.length;i++) {
		
	
		int val=i;
		if(!hashmap.containsKey((nums[i]))) {
		hashmap.put(target-nums[i], val);
	}
	
		else {
			result[0]=val;
			result[1]=hashmap.get(nums[i]);
			break;
		}
	}
	return result;
    }

public static void main(String[] args) {
	int[] tab= {2,11,5,10,7,8};
	int[] result=twoSum(tab,9);
	for(int i=0;i<result.length;i++) {
    	System.out.println("->"+result[i]);
    }

}}