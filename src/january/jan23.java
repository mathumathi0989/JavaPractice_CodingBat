package january;

public class jan23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given an array of ints, return true if every 2 that appears in the array is next to another 2.
//Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
//Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

		//twoTwo([4, 2, 2, 3]) → true
		int[] nums = {4, 2, 2, 3, 2} ;
		System.out.println(twoTwo(nums));
		//modThree([2, 1, 3, 5]) → true
		//sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
	}

	
	public static boolean twoTwo(int[] nums) {
  
   for (int i=0; i<nums.length; i++)
   {
      if (nums[i] != 2)
         continue;
      if (i >= 1 && nums[i-1] == 2)
         continue;
      if (i < (nums.length-1) && nums[i+1] == 2)
         continue;
      return false;
   }
   return true; 
}

	public boolean modThree(int[] nums) {
  
  if(nums.length>=3){
  for(int i =0; i <nums.length-2; i ++ ){
    //even 
  if(nums[i]%2==0){
    
    if(nums[i+1]%2==0 && nums[i+2]%2==0){
      return true;
    }
    
  }  
  else {
     if(nums[i+1]%2!=0 && nums[i+2]%2!=0){
      return true;
    }
    
  }
    
  }
  }

return false;
  
  
  
}

	public boolean sameEnds(int[] nums, int len) {
boolean result = true;


for (int i =0; i <len;i++)

if (!(nums[i] == nums[nums.length - len + i]))

result = false;

return result;

}

}
