package algo;

import java.util.Scanner;

public class BearProblem {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int value1= scanner.nextInt();
		int value2 = scanner.nextInt();
		int i=0 ;
		while (value1 <=value2)
		{	 value1*=3;
		      value2*=2;
		      i++;
		}
		System.out.println(i);
	}

}
