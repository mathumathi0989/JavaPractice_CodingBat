package january;

public class jan11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array 1: Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//Array 2: Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//Array 3: Given an array of ints, return true if the array contains no 1's and no 3's.
//Array 4: Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//Array 5: Given an array of ints, return true if the number of 1's is greater than the number of 4's
//Array 6: Given an array of ints, return true if every element is a 1 or a 4		
		//sum13([1, 2, 2, 1]) → 6
		//has22([1, 2, 2]) → true
		//lucky13([0, 2, 4]) → true
		//sum28([2, 3, 2, 2, 4, 2]) → true
		//more14([1, 4, 1, 4]) → false
		//only14([1, 4, 2, 4]) → false
	}

	public static int sum13(int[] nums) {
  
if(nums.length>1){
  int count = 0;
  if(nums[nums.length-1]==13){
    nums[nums.length-1]=0;
  }
    for(int i=0; i<nums.length; i++){
      if(nums[i]==13){
        nums[i] = 0; 
        nums[i+1] = 0;
      }
      count = count + nums[i];
    }
  return count;
  }
  return 0;
}

	public static boolean has22(int[] nums) {
  
  for(int i=0; i<nums.length-1; i++){
    
    if(nums[i]==2 && nums[i+1]==2){
      return true;
    }
   
    
  }
   return false;
}

	public static boolean lucky13(int[] nums) {
  
  for(int i=0; i<nums.length; i++){
    
    if(nums[i]==1 || nums[i]==3){
      return false;
    }
    
  }
  
  return true;
  
}
public static boolean sum28(int[] nums) {
  
  int count =0;
  
  for(int i=0; i<nums.length; i++){
    
    if(nums[i]==2){
      
      count = count + nums[i];
      
    }
    
    
  }
  if(count==8){
    return true;
  }
  
  return false;
  
}
public static boolean more14(int[] nums) {
  
  int count1 = 0;
  int count4 = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==1){
      count1 = count1 + 1;
    }
    if(nums[i]==4){
      count4 = count4 + 1;
    }
    
  }
  
if(count1>count4){
  return true;
}
return false;
  
}
public static boolean only14(int[] nums) {
  
 int count = 0;
  
  for(int i=0; i<nums.length; i++){
    
    if(nums[i]==1 || nums[i]==4){
     count = count + 1;
    }
    
  }
  if(count==nums.length){
    return true;
  }
  return false;
  
}

	
}
