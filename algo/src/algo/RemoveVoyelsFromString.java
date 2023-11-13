package algo;

import java.util.Set;

public class RemoveVoyelsFromString {
public static String removeVoyels(String ch) {
	Set<Character> voyels=Set.of('a', 'e', 'i','o','u');
	
	StringBuilder ch2= new StringBuilder();
	int n=ch.length();
	for(int i=0;i<n;i++) {
		if(!voyels.contains(ch.charAt(i))) {
			ch2=ch2.append(ch.charAt(i));
			
		}
		
	}
	System.out.println( ch2.toString());
	return ch2.toString();
}
public static void main(String args[]) {
		String ch="haroun";
String result=	removeVoyels(ch);
System.out.println(result);
}
}
