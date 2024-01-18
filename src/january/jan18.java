package january;

public class jan18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
//Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
//We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
		

		
		//pre4([1, 2, 4, 1]) → [1, 2]
		//post4([4, 4, 1, 2, 3]) → [1, 2, 3]
		//notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
		
		
	}

	public int[] pre4(int[] nums) {
    int n = 0;


  for(int i=0; i<nums.length; i++){
    
    if(nums[i]==4){
      n = i;
      break;
    }
    
  }
    int[] nums1 = new int[n];
    
  for(int i=0; i<n; i++){
    
    nums1[i] = nums[i];
    
  }
  
  return nums1;
}

	public int[] post4(int[] nums) {
  
  int n = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==4){
      n = i;
    }
  }
  
  int[] nums1 = new int[nums.length-(n+1)];
  
  for(int j=0; j<nums.length-(n+1); j++){
    nums1[j] = nums[n+1+j];
  }
  
  return nums1;
  
  
  
  
}
public int[] notAlone(int[] nums, int val) {
  
  for(int i=1; i<nums.length-1; i++ ){
    
    if(nums[i]==val){
     if (nums[i-1] != nums[i] && nums[i+1] != nums[i])
      if(nums[i-1]>nums[i+1]){
        nums[i]=nums[i-1];
      }
      else nums[i] = nums[i+1];
    }
  }
  return nums;

}

	
}
