package algo;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[] tab1, int[] tab2) {
        int N = tab1.length + tab2.length;
        int[] result = new int[N];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (k < N) {
            if (i < tab1.length && j < tab2.length) {
                if (tab1[i] < tab2[j]) {
                    result[k] = tab1[i];
                    i++;
                } else {
                    result[k] = tab2[j];
                    j++;
                }
            } else if (j == tab2.length) {
                result[k] = tab1[i];
                i++;
            } else if (i == tab1.length) {
                result[k] = tab2[j];
                j++;
            }
            
            k++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] merged = mergeTwoSortedArrays(arr1, arr2);

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

