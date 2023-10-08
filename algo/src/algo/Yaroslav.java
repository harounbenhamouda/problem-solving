package algo;

import java.util.Scanner;

public class Yaroslav {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int row=scanner.nextInt();
		int []arr= new int[row];
		int cpt=0;
		int maxrep=0;
		for(int j=0;j<row;j++) {
			arr[j]=scanner.nextInt();
		}
		for(int i =0;i <row;i++) {
			for(int j=0;j<row;j++) {
				if(arr[i]==arr[j]) {
					cpt=cpt+1;
					
				}
			}
			if (cpt>maxrep) {
				maxrep=cpt;
				
			}
			cpt=0;
			
			
		}
		if(row % 2 ==0) {
			if ((row/2)>=maxrep) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
		else {
			if (((row+1)/2)>=maxrep) {
				System.out.println("YES");
			}
			else System.out.println("NO");
			
		}
	}

}
