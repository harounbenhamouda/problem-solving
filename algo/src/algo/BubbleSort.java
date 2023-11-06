package algo;

public class BubbleSort {
public static int[] bubbleSort(int tab[]) {
	int cpt=tab.length-1;
	boolean swipe=false;
	while(cpt>=0 ) {
		swipe=false;
		for(int i=0;i<tab.length-1;i++) {
			if(tab[i]>tab[i+1]) {
				int aux=tab[i];
				tab[i]=tab[i+1];
				tab[i+1]=aux;
				swipe=true;
			}
		}
		cpt--;
		
	}
	return tab;
}
public static void main(String[] args) {
    int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
   
    int []result = bubbleSort(array);
    for(int i=0;i<result.length;i++) {
    	System.out.println("->"+result[i]);
    }
    
}
}