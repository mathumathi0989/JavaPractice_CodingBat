package january;

public class jan25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array - We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
	//Array 2 - Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers

	//isEverywhere([1, 2, 1, 3], 1) → true
		//sum67([1, 1, 6, 7, 2]) → 4
		int[] nums = {1, 1, 6, 10, 7, 2};
		System.out.println(sum67(nums));
		
	}

	public boolean isEverywhere(int[] nums, int val) {
  
  boolean result = true;

  for(int i=0; i<=nums.length-2; i++){
    if(nums[i]!=val && nums[i+1]!=val)
     result = false;
    
 }
   return result;
}
public static int sum67(int[] nums) {

int result = 0;
int c = 0;
for(int i=0; i<nums.length; i++){
  
  if(nums[i]==6){
    
    
    for(int j=i; nums[j]!=7 ; j++){
      nums[j]=0;
     c = j;
    
    }
    nums[c+1]=0;
    
    
  }
  else {
    result = result + nums[i];
  }
  
}


return result;
}






	
}
