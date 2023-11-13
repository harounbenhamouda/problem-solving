package algo;

public class FibonacciDynamic {
public static int fibonacciDynamic(int val) {
	int s=0;
	int 	a=1;
	int b=0;
	
	for(int i=2;i<=val;i++) {
	
			s=a+b;
			a=b;
			b=s;
			
	
	}
	return s;
}
public static void main(String[] args) {
	fibonacciDynamic(5);
}
}
