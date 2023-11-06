package algo;

public class RearangeSortedArray {

    public static int[] rearangeSortedArray(int[] tab) {
    	int x;
    	int maxIndex= tab.length-1;
    	int minIndex=0;
    	int max=tab[tab.length-1]+1;
    	for(int i=0;i<tab.length;i++) {
    		
    		if((i%2)==0) {
    			tab[i]=tab[i]+(tab[maxIndex]%max)*max;
             maxIndex--;
    		}
    		else {
    			tab[i]=tab[i]+(tab[minIndex]%max)*max;
    	         minIndex++;
    		}
    	}
    	for(int i=0;i<tab.length;i++) {
    		tab[i]=tab[i]/max;
    	}
    	return tab;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7,8};
        int[] result = rearangeSortedArray(array);

        System.out.println("Rearranged Array:");
        for (int num : result) {
            System.out.println("->" + num);
        }
    }
}
