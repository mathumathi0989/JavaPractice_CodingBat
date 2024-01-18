package january;

public class jan17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
//Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
//Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
//Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
//Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
//Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
//Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.
//Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
		
		//either24([1, 2, 2]) → true
		//matchUp([1, 2, 3], [2, 3, 10]) → 2
		//has77([1, 7, 1, 1, 7]) → false
		//has12([3, 1, 4, 5, 2]) → true
		//haveThree([3, 1, 3, 1, 3]) → true
		//tripleUp([1, 4, 5, 6, 2]) → true
		//fizzArray3(5, 10) → [5, 6, 7, 8, 9]
		//shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
		
		
	}

	
	public boolean either24(int[] nums) {
  
  boolean found2 = false;
  boolean found4 = false;
  
  for(int i=0; i<nums.length-1; i++){
    
    if(nums[i]==2 && nums[i+1]==2){
      found2=true;
    }
    
 if(nums[i]==4 && nums[i+1]==4){
    found4=true;
    }

  }
 
  
  if(found2==true && found4==true){
    return false;
  }
  else if(found2==false && found4==false){
    return false;
  }
  else return true;
  
 
  

}
public int matchUp(int[] nums1, int[] nums2) {
  
  int count = 0;
  for(int i=0; i<nums1.length; i++){
      if(nums2[i]-nums1[i]==2 ||nums2[i]-nums1[i]==1 || nums1[i]-nums2[i]==2 ||nums1[i]-nums2[i]==1){
        count = count +1;
      }

  }
  
  return count;
  
}

public boolean has77(int[] nums) {
  
  for(int i=0; i<nums.length-1; i++){
    if((nums[i]==7 && nums[i+1]==7 ) ){
      return true;
    }
    
  }
  
   for(int i=0; i<nums.length-2; i++){
    if((nums[i]==7 && nums[i+2]==7)){
      return true;
    }
    
  }
  return false;
  
}

public boolean has12(int[] nums) {
  
  for (int i=0; i< nums.length; i++){
    if(nums[i]==1){
      for(int j=i; j<nums.length; j++){
        if(nums[j]==2){
          return true;
        }
      }
    }
  }
  
  return false;
  
}
public boolean haveThree(int[] nums) {
  
  int count=0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==3){
      count = count + 1;
          i = i+1;
    }
  }
  if(count==3){
    return true;
  }
  return false;
  
}

public boolean tripleUp(int[] nums) {
  
  for(int i=0; i<nums.length-2; i++){
    
    if(nums[i]+1==(nums[i+1]) && (nums[i+1]+1)==(nums[i+2])){
      return true;
    }
    
    
  }
  return false;
  
}

public int[] fizzArray3(int start, int end) {
  int size = end-start;
  int[] num = new int[size];
  if(start<end){
    
    for(int i=0; i<size; i++){
      num[i] = start;
      start = start + 1;
    }

  }
  
  return num;
}

public int[] shiftLeft(int[] nums) {
  
  int size = nums.length;
  int[] nums1 = new int [size];
  
  if(nums1.length>1){
  for(int i=0; i<nums.length-1; i++){
    
    nums1[i] = nums[i+1];
     nums1[nums.length-1] = nums[0];
  }
  return nums1;
  }
 
  return nums;
}


	
}
