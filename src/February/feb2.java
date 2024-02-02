package February;

public class feb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
//Recursion 2: Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

		
		//array6([1, 6, 4], 0) → true
		//int[] nums = {1, 6, 4};
		//System.out.println(array6(nums, 0));
		
		//array11([1, 2, 11], 0) → 1
		int[] nums = {1, 2, 11};
		System.out.println(array11(nums, 0));
	}
	
	
public static boolean array6(int[] nums, int index) {
  if(index >= nums.length)
        return false;
  return (nums[index]==6) || array6(nums, index+1) ;
 
  
}
public static int array11(int[] nums, int index) {
  if(index>=nums.length) return 0;
  if(nums[index]==11) return 1 + array11(nums, index+1);
  else return array11(nums, index+1);
  
}
}
