package january;

public class jan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String 1: Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
//Array 1: Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//Array 2: Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

		
		System.out.println(sameStarChar("*xa*az"));
		// → true
		// 3
		//int[] nums = {2, 1, 2, 3, 4};
		//System.out.println(countEvens(nums));
		int[] nums = {10, 3, 5, 6};
		System.out.println(bigDiff(nums));
		// 7
		
		
	}
public static boolean sameStarChar(String str) {

if(str.length()>1){
for(int i=1; i<str.length()-1; i++){
  if(    str.charAt(i)=='*' && str.charAt(i-1) != str.charAt(i+1)   )  {
      return false ;
     } 
 }
}

return true;

}

public static int countEvens(int[] nums) {

int count = 0;

for(int i=0; i<nums.length; i++){
if(nums[i]%2 == 0){
  count = count +1;
}
}
return count;
}

public static int bigDiff(int[] nums) {
  int largest = nums[0];
  int smallest = nums[0];

  for(int i=1; i<nums.length; i++){
    
   smallest =  Math.min(smallest, nums[i]);
   largest =  Math.max(largest, nums[i]);
  }

  return largest-smallest;
}



}
