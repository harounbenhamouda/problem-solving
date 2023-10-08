package algo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HorseColorProblem {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
	   Set<Integer> nums=new HashSet<>();
		
		
		
		for(int i=0;i<4;i++) {
			
			 nums.add(scanner.nextInt());
			
		}
		
		System.out.println(nums.size());
			
		
		System.out.println(4-(nums.size()));
	}
	
	
}
