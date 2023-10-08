package algo;

import java.util.Scanner;

public class FindMissingNumberInRangeOfNumbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
       
      
        
        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 100); 
        int[] U = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter U[" + i + "]: ");
            U[i] = scanner.nextInt();}
        boolean verif = true; 
        int j = 1;
        int missing_number = 0;

        while ((verif == true) && (j <= n)) {
        	verif=false;
            for (int i = 0; i < n; i++) {
                if (U[i] == j) {
                    verif = true;
                    break; 
                }
            }

            if (verif == false) {
                missing_number = j;
                System.out.println("The missing number is: " + missing_number);

            }

            j++; 
        }

        
        
}
}