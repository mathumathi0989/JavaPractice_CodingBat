package decJavaCoding;

import java.util.Arrays;

public class dec22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array 1: Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
//array 2: Given an int array length 2, return true if it contains a 2 or a 3.
//array 3: Given an int array length 2, return true if it does not contain a 2 or 3.
//array 4: Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's
//array 5: Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
//array 6: Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
//array 7: Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//Given a string, return a string where for every char in the original, there are two chars.
		
		//doubleChar("The") → "TThhee"
		
		

		
		System.out.println();//
//	int[] nums = {1, 2,3}; //[1, 3]
//	System.out.println(Arrays.toString(makeEnds(nums)));// [1, 3]
	
//int[] nums = {2,5};	
//true
	//System.out.println((has23(nums)));
	
//	int[] nums = {4, 5};	
// true		
	//	System.out.println((no23(nums)));
	//	int[] nums = {4, 5, 6};		
		
//[0, 0, 0, 0, 0, 6]
		
	//	System.out.println(Arrays.toString(makeLast(nums)));
		//int[] nums = {2, 2};
	// true	
	//System.out.println((double23(nums)));
	
		int[] nums = {1, 2, 3};
//[1, 2, 0]
		System.out.println(Arrays.toString(fix23(nums)));	
		int[] a = {1, 2, 3};
			int[] b = {1, 3};
	//	start1([1, 2, 3], [1, 3]) // 2
		System.out.println((start1(a,b)));
		
		
	}
public static int[] makeEnds(int[] nums) {
  int[] nums1 = new int[2];
  nums1[0] = nums[0];
  nums1[1] = nums[nums.length-1];
  return nums1;
}

public static boolean has23(int[] nums) {
  
  if((nums[0]==2 || nums[1]==3)||(nums[0]==3 || nums[1]==2)){
    return true;
  }
  return false;
  
}

public static boolean no23(int[] nums) {
  
  if((nums[0]!=2 && nums[1]!=3) && (nums[0]!=3 && nums[1]!=2)){
    return true;
  }
  return false;
  
}

public static int[] makeLast(int[] nums) {
  
  int[] nums1 = new int[nums.length * 2];
  for(int i=0; i<nums1.length-2; i++){
    nums1[i] = 0;
  }
  nums1[nums1.length-1] = nums[nums.length-1];
  return nums1;
  
}
public static boolean double23(int[] nums) {
 
 if(nums.length>1){
   if ((nums[0]==2 && nums[1]==2) || (nums[0]==3 && nums[1]==3)){
     return true;
   }
 }
   return false;
}
public static int[] fix23(int[] nums) {

for(int i=0; i<nums.length; i++){
  if(nums[i]==2 && nums[i+1]==3){
    nums[i+1]=0;
    break;
  }
}
return nums;
}

public static int start1(int[] a, int[] b) {
int count=0;
 if (a.length != 0) {
     if (a[0]== 1) count++; }
  if (b.length != 0) {
     if (b[0]== 1) count++; }
     return count;

}
	
public static String doubleChar(String str) {

String s1 = "";

for(int i=0; i<str.length(); i++){
  
  s1 = s1 + str.charAt(i)+str.charAt(i);
}
return s1;


}

}
