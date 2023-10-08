package algo;

import java.util.Scanner;

public class SecondMax {
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
            U[i] = scanner.nextInt();

            
        }

       int max=Integer.MIN_VALUE;
       int secondMax=Integer.MIN_VALUE;
       for(int i=0;i<n;i++) {
    	   if(U[i]>max) {
    		   secondMax=max;
    		   max=U[i];
    		  
    		   
    	   }
    	   else if((U[i]>secondMax)&&(U[i]!=max)){
    		   secondMax=U[i];
    	   }
    			   
       }
        
        System.out.println(secondMax);
             
    }

}
