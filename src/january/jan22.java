package january;

public class jan22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array 1: Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
//Array 2: Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
		
		//withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
		//zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
		
	}

	public int[] withoutTen(int[] nums) {
 int size = nums.length;
  int[] nums1 = new int[size];
  
  int j = 0;
  
  for(int i=0; i<size; i++){
    if(nums[i]!=10){
      nums1[j] = nums[i];
     j++;
    }
}
 for(int i = j; i < size; i++) {
      nums1[i] = 0;
    }
  
  return nums1;
}
public int[] zeroFront(int[] nums) {
  int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c++] = temp;
            }
        }

        return nums;
}


	
	
}
