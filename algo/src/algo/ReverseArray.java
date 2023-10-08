package algo;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
       // char[] L = new char[100];
        
        
        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 100); // Adjusted the condition to use OR
        int[] U = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter U[" + i + "]: ");
            U[i] = scanner.nextInt();

            
        }

       int aux;
        for (int i = 0; i < n/2; i++) {
            aux=U[i];
           U[i]= U[n-1-i];
             U[n-1-i]=aux;
            
        }
        

        for (int i = 0; i < n; i++) {
            System.out.println(U[i]);
        }
    }
}
