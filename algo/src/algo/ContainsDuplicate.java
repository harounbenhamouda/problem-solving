package algo;

import java.util.HashMap;

public class ContainsDuplicate {
public static boolean containsDuplicate1(int []tab) {
	HashMap<Integer,Integer> hashmap=new HashMap<>();
	for(int i=0;i<=tab.length;i++) {
		
		
		if(hashmap.containsKey(tab[i])) {
			return true ;
		}
		else{hashmap.put(tab[i], tab[i]);
	}}
	return false;
}
public static void main(String[] args) {
	int[] tab= {1,1,3,4,7,8};
	boolean hasDuplicates = containsDuplicate1(tab);
    if (hasDuplicates) {
        System.out.println("The array contains duplicates.");
    } else {
        System.out.println("The array does not contain duplicates.");
    }
}
}
