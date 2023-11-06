package algo;

public class SelectionSort {
    public static int[] selectionSort(int[] t) {
        int n = t.length;

        for (int i = 0; i < n - 1; i++) {
            int pmin = i;

            for (int j = i + 1; j < n; j++) {
                if (t[j] < t[pmin]) { 
                    pmin = j;
                }
            }

            int aux = t[pmin];
            t[pmin] = t[i];
            t[i] = aux;
        }

        return t; 
    }
    public static void main(String[] args) {
	    int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
	   
	    int []result = selectionSort(array);
	    for(int i=0;i<result.length;i++) {
	    	System.out.println("->"+result[i]);
	    }
	    

	}
}
