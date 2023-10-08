package algo;

import java.util.Scanner;

public class ColorfulStones {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String stone = scanner.next();
		String ch = scanner.next();
		int i ;
		for(i=0;i<stone.length();) {
			for(int j=0;j<ch.length();) {
			if (stone.toCharArray()[i]==ch.toCharArray()[j]) {
				i=i+1;
				j=j+1;
			}else {
				j=j+1;
			}
		}
		}
		System.out.println(i);
	}

}
