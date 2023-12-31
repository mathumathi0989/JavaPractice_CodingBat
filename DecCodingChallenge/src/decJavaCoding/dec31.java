package decJavaCoding;

public class dec31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
//Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
//Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
//Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
//Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
//Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
//Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
//Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
//Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
		
		
		
		//biggerTwo([1, 2], [3, 4]) → [3, 4]
		//makeMiddle([1, 2, 3, 4]) → [2, 3]
		//plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
		//swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
		//midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
		//maxTriple([1, 2, 3]) → 3
		//frontPiece([1, 2, 3]) → [1, 2]
		//unlucky1([1, 3, 4, 5]) → true
		//make2([4, 5], [1, 2, 3]) → [4, 5]
		//front11([1, 2, 3], [7, 9, 8]) → [1, 7]
		
	}
	
	public static int[] biggerTwo(int[] a, int[] b) {

int c = a[0]+a[1];
int d = b[0]+b[1];
if(c==d){
  return a;
}
else if(c>d){
  return a;
}
else return b;
}

	public static int[] makeMiddle(int[] nums) {
  int c = nums.length/2;
  int nums1[] = new int[2];
  nums1[0] = nums[c-1];
  nums1[1] = nums[c];
  return nums1;
  
  
}

public static int[] plusTwo(int[] a, int[] b) {
  
 int c[] = new int[4];
c[0] = a[0];
c[1] = a[1];
 c[2] = b[0];
 c[3] = b[1];
 return c;
  
}
	public static int[] swapEnds(int[] nums) {
  int c;
  if(nums.length>=1){
    c = nums[0];
    nums[0] =   nums[nums.length-1];
    nums[nums.length-1] = c;
    
  }
  return nums;
}

	public static int[] midThree(int[] nums) {
  int[] nums1 = new int[3];
  int c = nums.length/2;
  if (nums.length>3){
    nums1[0] = nums[c-1];
    nums1[1] = nums[c];
    nums1[2] = nums[c+1];
      return nums1;
  }
  else return nums;
}

public static int maxTriple(int[] nums) {
  int c = nums.length/2;
  if(nums.length>1){
    if(nums[0]>nums[c] && nums[0]>nums[nums.length-1]){
      return nums[0];
    }
    else if(nums[c]>nums[0] && nums[c]>nums[nums.length-1]){
      return nums[c];
    }
    return nums[nums.length-1];
  }
return nums[0];
  
}

public static int[] frontPiece(int[] nums) {
  int[] nums1 = new int[2];
  if(nums.length>2){
    nums1[0] = nums[0];
    nums1[1] = nums[1];
    return nums1;
  }
  return nums;
}

public static boolean unlucky1(int[] nums) {
if(nums.length>1){
if((nums[0]==1 && nums[1]==3)||(nums[1]==1 && nums[2]==3)||(nums[nums.length-2]==1 && nums[nums.length-1]==3)){
   return true;
}
}
return false;

}

public static int[] make2(int[] a, int[] b) {
  
  int[] make21 = new int[2];
  
  if(a.length>=2){
    make21[0] = a[0];
    make21[1] = a[1];
    return make21;
  }
  else if(a.length==1){
    make21[0] = a[0];
    make21[1] = b[0];
    return make21;
  }
  else 
    make21[0] = b[0];
    make21[1] = b[1];
    return make21;
  
}
public static int[] front11(int[] a, int[] b) {
  

  if(a.length==0 && b.length==0){
    return  new int[]{};
  }
  else if(a.length==0){
    return new int[] {b[0]};
  }
  else if(b.length==0){
       return new int[] {a[0]};
  }
  else 
      return new int[] {a[0],b[0]};
}



}
