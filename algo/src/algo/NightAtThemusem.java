package algo;

import java.util.Scanner;

public class NightAtThemusem {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int start=96;
		int move=0;
		int result;
		String ch = scanner.next();
		for(int i=0;i<ch.length();i++) {
			result=Math.abs(ch.toCharArray()[i]-start);
			if(result<=13) {
				move=move+result;
			}
			if(result>13) {
				move =(26-result)+move;
			}
			start=ch.toCharArray()[i];
		}
		System.out.println(move);
	}

}
