package algo;

public class SquaresOfSortedArray {
public static int[] squareOfSortedArray(int[] tab) {
	int n =tab.length;
	int[] result=new int[n];
	int j=n-1;
	int i=0;
	for(int k=0;k<n;k++) {
		if(Math.abs(tab[i])>Math.abs(tab[j])) {
			result[k]=tab[i]*tab[i];
			i++;
		}
		else {
			result[k]=tab[j]*tab[j];
			j--;
		}
	}
	return result;
}
public static void main(String[] args) {
    int[] array = {-4, -2, 0, 2, 3, 6, 10}; 
   
    int []result = squareOfSortedArray(array);
    for(int i=0;i<result.length;i++) {
    	System.out.println("->"+result[i]);
    }
    

}

}
