package january;

import java.util.Arrays;

public class jan24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Array - For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
//Array 2 - Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
//Array 3: This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
		
		
		//tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
		//evenOdd([2, 1]) → [2, 1]
		//fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
		int[] nums = {1, 0, 1, 0, 0, 1, 1};
		System.out.println(Arrays.toString(evenOdd(nums)));
		evenOdd(nums);
		
	}

	public static int[] tenRun(int[] nums) {
  
  for(int i=0; i<nums.length-1; i++){
    
    if(nums[i]%10==0){
      
      if(nums[i+1]%10==0){
        continue;
      }
      else {
        nums[i+1]=nums[i];
      }
      
    }
    
  }
  return nums;
}

	public static int[] evenOdd(int[] nums) {
  
int[] nums1 = new int[nums.length];
int j = 0;
int k=0;
for(int i=0; i<nums.length; i++) {
  
    if(nums[i]%2==0){
    
  nums1[j] = nums[i];
 
    j++;
  }
  else { nums1[(nums.length-1)-k] = nums[i];
 
  k++;
  }
  
}

return nums1;

}

public String[] fizzBuzz(int start, int end) {
  int size = end - start;
  String[] result = new String[size];
  
  int j = 0;
  for(int i= start; i<end; i++){
    
    if(i%3==0 && i%5==0){
      result[j] = "FizzBuzz";
      start++;
      j++;
    }
    else if (i%3==0){
      result[j] = "Fizz";
      start++;
      j++;
    }
    else if(i%5==0){
      result[j] = "Buzz";
      start++;
      j++;
    }
    else {
      result[j] = String.valueOf(start);
      start++;
      j++;
    }
    
    
  }
  
  
  
  
  
  return result;
  
  
}
	
	
}
