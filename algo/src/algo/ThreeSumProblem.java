package algo;

import java.util.Arrays;

import java.util.Arrays;

public class ThreeSumProblem {
    public static void threeSum(int[] tab, int target) {
        Arrays.sort(tab);

        int index;
        int i = 0;
        for (int j = tab.length - 1; j >= 2; j--) {

          

                index = j - 1;

                while (i < index) {
                    int rest = target - (tab[i] + tab[j]);
                    if (rest > tab[index]) {
                        i++;
                    } else if (rest == tab[index]) {
                        System.out.println("The result is " + tab[i] + ", " + tab[index] + ", " + tab[j]);
                        i++;
                        index--;
                    } else {
                        index--;
                    }
                }
            }
            
        
    }

    public static void main(String[] args) {
        int[] tab = {0,1, 2, 3, 4, 7, 8, 9};
        threeSum(tab, 6);
    }
}










