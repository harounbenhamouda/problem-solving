package algo;

import java.util.Scanner;



public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int[] T = new int[100];

        do {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 100);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter U[" + i + "]: ");
            T[i] = scanner.nextInt();
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (T[i] == 0) {
                int aux = T[j];
                T[j] = T[i];
                T[i] = aux;
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(T[i] + " ");
        }
    }
}