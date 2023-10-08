package algo;

import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int size = scanner.nextInt();
		String aux1="that";
		String aux2="that";
		if (size==1) {
			System.out.println("i hate it");
		}
		for(int i=1;i<=size;i++) {
			if(i==size) {
				aux1="it";
				aux2="it";
			}
			if((i%2)==0){
				System.out.println("i love"+aux2);
						
			}
			else {
				System.out.println("i hate"+aux1);
			}
			
		}
	}


}
