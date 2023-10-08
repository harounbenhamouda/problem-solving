package algo;

import java.util.Scanner;

public class PUm {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
        int N= scanner.nextInt();
       int  j=1;
for(int i=1;i<=N;i++) {
	
	
		if(j %4 ==0) {
			 System.out.println(" PUM");
			 j++;
			 i--;
			 continue;
		} 
		
		System.out.println(j++ +" "+ j++ +" "+ j++);
	
}
System.out.println("pum");

	}
	
}
