package February;

public class feb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Warmup 1: Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//Warmup 2: Given a non-empty string like "Code" return a string like "CCoCodCode".
//Warmup 3: Given an array of ints, return the number of 9's in the array.		
//Warmup 4: Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
//Warmup 5: Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
	//stringBits("Heeololeo") → "Hello"
	//stringSplosion("Code") → "CCoCodCode"
	//arrayCount9([1, 9, 9, 3, 9]) → 3	
	//arrayFront9([1, 2, 3, 4, 9]) → false	
	//array123([1, 1, 2, 1, 2, 3]) → true
		
		
	}
public String stringBits(String str) {
  
String s = "";
for(int i=0; i<str.length(); i=i+2){
  s = s+ s.valueOf(str.charAt(i));
}
  return s;
  
}
public String stringSplosion(String str) {
  
  String s = "";
  for(int i =0; i<=str.length(); i++){
    s = s + str.substring(0,i);
  }
  
  return s;
}
public int arrayCount9(int[] nums) {
  int count = 0;
  
  for(int i=0; i<nums.length; i++){
    
    if(nums[i]==9) count = count+1;
    
  }
  return count;
  
}
public boolean arrayFront9(int[] nums) {
  boolean result = false;
  int end = nums.length;
if(nums.length>4) end=4; 
  for(int i=0; i<end; i++){
    if(nums[i]==9) return true;
   
  }
 
  return result;
}
public boolean array123(int[] nums) {
  
  for(int i=0; i<nums.length-2; i++){
    if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  return false;
}


}
