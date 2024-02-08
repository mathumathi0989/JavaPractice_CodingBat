package February;

import java.util.List;

public class feb6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Functional 1: Given a list of integers, return a list where each integer is multiplied by 2.
		//doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
		
	}

	public static List<Integer> doubling(List<Integer> nums) {
  nums.replaceAll(n -> n * 2);
  return nums;
}

	
}
