package decJavaCoding;

import java.util.Arrays;

public class dec20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array 1: Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//Array 2: Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//Array 3: Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
//Array 4: Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
//Array 5: Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
		
//[2, 3, 1]
int[] nums = {1, 2, 3};
System.out.println(Arrays.toString(rotateLeft3(nums)));		
// [3, 2, 1]
System.out.println(Arrays.toString(reverse3(nums)));	
//[3, 3, 3]
System.out.println(Arrays.toString(maxEnd3(nums)));	
// 3
System.out.println((sum2(nums)));	
int[] a = {1, 2, 3};
int[] b = {4, 5, 6};
// [2, 5]
System.out.println(Arrays.toString(middleWay(a,b)));			
	}

public static int[] rotateLeft3(int[] nums) {
  int[] nums1 = new int[nums.length];
 
  for(int i=1; i<nums.length; i++){
    nums1[i-1] = nums[i];
  }
   nums1[nums.length-1] = nums[0];
  return nums1;
  
}
public static int[] reverse3(int[] nums) {
 int[] nums1 = new int[nums.length];
for(int i=0; i<nums.length; i++){
  nums1[i] = nums[nums.length - i -1];
  }
return nums1;
}

public  static int[] maxEnd3(int[] nums) {
  int[] nums1 = new int[nums.length];
  
  if(nums[0]>nums[nums.length-1]){
    for(int i=0; i<nums.length; i++){
    nums1[i] = nums[0] ;
    
    }
    return nums1;
  }
  else {
     for(int i=0; i<nums.length; i++){
    nums1[i] = nums[nums.length-1] ;
    }
       return nums1;
  } 
}

public static int sum2(int[] nums) {
  if(nums.length>=2){
    return nums[0]+nums[1];
  }
  else if (nums.length==0){
    return 0;
  }
  return nums[0];
}
public static int[] middleWay(int[] a, int[] b) {
  int[] c = new int[2];
   c[0] = a[1];
   c[1] = b[1];
return c;

}



}
