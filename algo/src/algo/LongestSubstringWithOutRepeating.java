package algo;

import java.util.HashMap;

public class LongestSubstringWithOutRepeating {
public static int longestSubstring(String ch) {
	
	HashMap<Character,Integer> hashmap=new HashMap<>();
	char[] ch1=ch.toCharArray();
	int max=0;
	int start=0;
	for(int end=0;end<ch1.length;end++) {
		char val=ch1[end];
		if(hashmap.containsKey(val)) {
			start = end - hashmap.get(val) + 1;
					}
		hashmap.put(val, end);
		int current =end-start+1;
		 max=Math.max(max, current);
	}
	return max;
}
public static void main(String Args[]) {
String ch="pwwkew";
int result=longestSubstring(ch);
System.out.println(result);
	
}
}
