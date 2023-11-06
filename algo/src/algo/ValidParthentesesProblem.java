package algo;

import java.util.Stack;

public class ValidParthentesesProblem {
   public static boolean IsValid(String ch) {
	   Stack<Character> stack = new Stack<>();
	      char[] chars=ch.toCharArray();
	      for(char c : chars) {
	    	  if(c=='('||c=='{'||c=='[') {
	    		  stack.push(c);
	    	  }
	    	  else {
	    		  if(stack.isEmpty()){
	    			  return false;
	    	  }
	    		  else {
	    		  char top=stack.peek();
	    		  if(c==')'&&top=='(' || c=='}'&&top=='{'||c==']'&&top=='[') {
	    			  stack.pop();
	    		  }
	    		  else {
	    			  return false;
	    		  }
	    		
	    		  }
	    	  }
	    	  
	      }
	      return stack.isEmpty();
   }
   public static void main(String[] args) {
	      String str = "({}[])";
	      System.out.println("Before reverse - " + str);
	      System.out.println("After reverse - " + IsValid(str));
	   }

}
