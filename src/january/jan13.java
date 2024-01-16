package january;

public class jan13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array 1: Given an array of ints, return true if it contains no 1's or it contains no 4's.
		
		//no14([1, 2, 3]) → true
		
		
	}

	
	public boolean no14(int[] nums) {

boolean flag1 = false;
boolean flag4 = false;

for(int i=0; i<nums.length;i++){
  
  if(nums[i]==1){
    flag1 = true;
    
  }
  if(nums[i]==4){
    flag4 = true;
  }
}

if(flag1== true && flag4==true){
  return false;
}
return true;


}

	
	
}
