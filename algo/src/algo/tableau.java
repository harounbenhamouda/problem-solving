package algo;

import java.util.Scanner;

import java.util.Scanner;

public class tableau {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        char[] L = new char[100];
        int[] U = new int[100];
        int[] T = new int[100];
        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 100); // Adjusted the condition to use OR

        for (int i = 0; i < n; i++) {
            System.out.print("Enter U[" + i + "]: ");
            U[i] = scanner.nextInt();

            char LValue;
            do {
                System.out.print("Enter O or N: ");
                LValue = scanner.next().charAt(0);
            } while (LValue != 'O' && LValue != 'N');

            L[i] = LValue;
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (L[i] == 'O') {
                T[j] = U[i];
                j++; // Increment j, not j+=j;
            }
        }

        for (int b = j; b < n; b++) {
            T[b] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(T[i]);
        }
    }
}
