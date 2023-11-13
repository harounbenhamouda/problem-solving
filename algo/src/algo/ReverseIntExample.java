package algo;
import java.util.Stack;


	public class ReverseIntExample {
	    public static int reverseInt(int number) {
	        int reversedNumber = 0;
	        Stack<Integer> stack = new Stack<>();
	        int length = String.valueOf(number).length() - 1;
	        int remainder = number;

	        for (int i = 0; i <= length; i++) {
	            double pui = Math.pow(10, length - i);
	            int digit = (int) (remainder / pui);
	            stack.push(digit);
	            remainder = (int) (remainder % pui);
	        }

	        int i = 0;
	        while (!stack.isEmpty()) {
	            reversedNumber += stack.pop() * Math.pow(10, length - i);
	            i++;
	        }

	        System.out.println(reversedNumber);
	        return reversedNumber;
	    }
	    public static int reverseInt2(int number) {
	    	int result=number;
	    	if(number<0) {
	    		result=result*-1;
	    	}
	    	int lastdegit=1;
	    	int newnumber=0;
	    	while(result>0) {
	    		lastdegit=result%10;
	    		newnumber=newnumber*10+lastdegit;
	    		result=result/10;
	    	}
	    	return newnumber;
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        int result = reverseInt(127);
	        int result2 = reverseInt2(127);
	        System.out.println("Reversed Number: " + result);
	        System.out.println("Reversed Number: " + result2);
	    }
	}

	
