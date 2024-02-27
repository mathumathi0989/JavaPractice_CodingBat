package February;

import java.util.HashSet;

public class feb27 {

	public static void main(String[] args) {
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

}
