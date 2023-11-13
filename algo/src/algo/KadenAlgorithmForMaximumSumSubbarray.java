package algo;

public class KadenAlgorithmForMaximumSumSubbarray {
public static int maximumSubArray(int[]t) {
	int n=t.length;
	int max=t[0];
	int bestMax=t[0];
	for(int i=0;i<n;i++) {
		if(max+t[i]<t[i]) {
			max=t[i];
		}
		
		else{max=t[i]+max;
		
	}
	
	
	
	if(max>bestMax) {
		bestMax=max;
	}
}
	return bestMax;
	
}
public static void main(String[] args) {
    int[] array = {-9,-4,-5,6,9};
    int result = maximumSubArray(array);
    System.out.println("Maximum Subarray Sum: " + result); maximumSubArray(array);
}
}