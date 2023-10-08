package algo;

import java.util.Scanner;

public class KensiaAndPanScales {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		String scale=scanner.next();
		String lefScale;
		String rightScale;
		//String chaine=scanner.next();
	int n =scale.toCharArray().length;
	int pos=0;
	for(int i=0;i<n;i++) {
		if(scale.toCharArray()[i]=='|') {
			pos=i;
		}
	}
	lefScale=String.valueOf(scale.toCharArray(), 0, pos);
	s=scale.substring(pos+1, n);
	
		
}}