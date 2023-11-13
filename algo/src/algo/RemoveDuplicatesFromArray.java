package algo;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
public static int[]removeDuplictes(int[] tab){
	
	int i=0;
	for(int j=1; j<tab.length;j++) {
		if(tab[i]!=tab[j]) {
			i++;
			tab[i]=tab[j];
		}
	}
		int[] newarray=Arrays.copyOf(tab, i+1)	;
		return newarray;
}
public static void main(String args[]) {
	int[] tab= {0,0,1,1,1,1,8,9,10};
	int[] result=removeDuplictes(tab);
	for(int i=0;i<result.length;i++) {
		System.out.println("t->"+result[i]);
	}
}
}
