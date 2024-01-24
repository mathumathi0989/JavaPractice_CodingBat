package january;

import java.util.Arrays;

public class jan24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Array - For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
//Array 2 - Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
		
		
		//tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
		//evenOdd([2, 1]) → [2, 1]
		int[] nums = {1, 0, 1, 0, 0, 1, 1};
		System.out.println(Arrays.toString(evenOdd(nums)));
		evenOdd(nums);
		
	}

	public static int[] tenRun(int[] nums) {
  
  for(int i=0; i<nums.length-1; i++){
    
    if(nums[i]%10==0){
      
      if(nums[i+1]%10==0){
        continue;
      }
      else {
        nums[i+1]=nums[i];
      }
      
    }
    
  }
  return nums;
}

	public static int[] evenOdd(int[] nums) {
  
int[] nums1 = new int[nums.length];
int j = 0;
int k=0;
for(int i=0; i<nums.length; i++) {
  
    if(nums[i]%2==0){
    
  nums1[j] = nums[i];
 
    j++;
  }
  else { nums1[(nums.length-1)-k] = nums[i];
 
  k++;
  }
  
}

return nums1;

}

	
	
}
