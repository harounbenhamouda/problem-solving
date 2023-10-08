package algo;

import java.util.Scanner;

public class DeleteEvenNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
                int[] U = new int[100];
      
        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 100); // Adjusted the condition to use OR

        for (int i = 0; i < n; i++) {
            System.out.print("Enter U[" + i + "]: ");
            U[i] = scanner.nextInt();
}
        int[] T = new int[100];
    	   for (int i = 0; i < n; i++)      {
    		   if(U[i]%2 !=0) {
    			  T[i]=U[i];
    		   }
    	   }
        
}}