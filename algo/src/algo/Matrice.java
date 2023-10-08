package algo;

import java.util.Scanner;

public class Matrice {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		 System.out.print("Ecrire un row: ");
		int row=scanner.nextInt();
		System.out.print("Ecrire col: ");
		int col=scanner.nextInt();
		System.out.print("Ecrire un entier x: ");
		int x = scanner.nextInt();
		int cmp=0;
		int [][] arr= new int[row][col];
		for(int i=0;i< row;i++) {
			
			for(int j=0;j<col;j++) {
				arr[i][j]=scanner.nextInt();
			}
			
		}

       for(int i=0;i< row;i++) {
			
			for(int j=0;j<col;j++) {
				if (arr[i][j]==x) {
				cmp=1;
				break;
				}
				
				
			}
			
		}
       if(cmp==1) {
    	   System.out.println("will not take number");
       }
       else {
    	   System.out.println("will take number");
       }
	}

}
