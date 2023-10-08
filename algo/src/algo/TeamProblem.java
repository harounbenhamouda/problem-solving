package algo;

import java.util.Scanner;

public class TeamProblem {

	

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int size= scanner.nextInt();
		int range=scanner.nextInt();
		int cpt2=0;
		int i ;
		for(i=0;i<size;i++) {
			int cpt1=0;
			String num= scanner.next();
			for(int j=0;j<num.length();j++) {
				
				for(int b=0; b<=range;b++) {
					if ((num.contains(String.valueOf(b)))) {
						cpt1=cpt1+1;
					}
				}
				
		
			
				if(cpt1==range+1) {
					cpt2=cpt2+1;
				}
		}
			
		}
		System.out.println(cpt2);
	}

}
