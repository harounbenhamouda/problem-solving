package algo;


	import java.util.HashMap;
import java.util.Stack;

	import java.util.Stack;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String s) {
        Stack<Character> stack = new Stack<>();

       
        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        
        int j = 0;
        while (!stack.isEmpty()) {
            char current = stack.pop();
            if (current == s.charAt(j)) {
                return j;
            }
            j++;
        }

        
        return -1;
    }
    public static int firstNonRepeatingCharacter2(String s) {
    	
    	HashMap<Character,Integer> hashmap=new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		hashmap.put(s.charAt(i), i);
    	}
    	for(int i=0;i<s.length();i++) {
    		if(hashmap.containsKey(s.charAt(i))&& hashmap.get(s.charAt(i))==i) {
    			return i;
    		}
    	
    	}
    	return -1;
    	}
public static int firstNonRepeatingCharacter3(String s) {
    	
    	HashMap<Character,Integer> hashmap=new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		if(hashmap.containsKey(s.charAt(i))&& hashmap.get(s.charAt(i))==i) {
    			return i;
    		}
    		else {hashmap.put(s.charAt(i), i);}
    	}
    	
    	
    	return -1;
    	}
    
    public static void main(String[] args) {
        String input = "leetcode";
        int result = firstNonRepeatingCharacter(input);

        if (result != -1) {
            System.out.println("The index of the first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}
