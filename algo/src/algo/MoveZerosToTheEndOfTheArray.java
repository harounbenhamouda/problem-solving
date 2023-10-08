package algo;

import java.util.Scanner;

public class MoveZerosToTheEndOfTheArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
       
      
        
        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 100); // Adjusted the condition to use OR
        int[] U = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter U[" + i + "]: ");
            U[i] = scanner.nextInt();}
        
        int j = 0; 
        for (int i = 0; i < n; i++) { 
            if (U[i] != 0) {
                int temp = U[i];
                U[i] = U[j];
                U[j] = temp;
                j++;
            }
        }

        
        
        for (int i = 0; i < n; i++) {
            System.out.println(U[i]);
        }
        
}
}