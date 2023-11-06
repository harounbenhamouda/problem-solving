package algo;

public class InsertionSort {

	public static int[] InsertionSort(int [] tab) {
		int n=tab.length;
		
		for(int i =1;i<n;i++) {
			
			int j=i-1;
			int aux=tab[i];
			while(j>=0&& aux<tab[j]) {
				tab[j+1]=tab[j];
				j--;
			}
			tab[j+1]=aux;
		}
		return tab;
	}
	public static void main(String[] args) {
	    int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
	   
	    int []result = InsertionSort(array);
	    for(int i=0;i<result.length;i++) {
	    	System.out.println("->"+result[i]);
	    }
	    

	}}
