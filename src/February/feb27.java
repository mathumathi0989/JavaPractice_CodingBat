package February;

import java.util.HashSet;

public class feb27 {

	
	public static void duplicateNos() {
		//to find duplicate numbers in an array
		int[] arr = new int[] {2,4,2,5,3, 3, 5, 7, 19, 2029};	
		HashSet<Integer> unique = new HashSet<>();	
		HashSet<Integer> duplicate = new HashSet<>();
		for(int num: arr) {
		//	unique.add(num);
			if(!unique.add(num)) {
				duplicate.add(num);
			}
		}
		//System.out.println("Unique numbers are " +unique);
		System.out.println("Duplicate numbers are "+duplicate);	
	}
	
	public static void maxMin() {
		int[] ar = new int[] {2,2,3,12,2323,1,23,454,653};
		int min = ar[0];
		int max = ar[0];
		for(int i=1; i<ar.length; i++) {
			
			if(ar[i]>max) {
				max= ar[i];
				
			}
			if(ar[i]<min) {
		
				min = ar[i];
			
			}
			
		}
		
		System.out.println("Maximum number is " +max);
		System.out.println("Minimum number is " +min);
		
		
		
	}
	
	public static void main(String[] args) {
	duplicateNos();
	maxMin();

	}

}
