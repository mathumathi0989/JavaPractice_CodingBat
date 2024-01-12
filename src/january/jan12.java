package january;

public class jan12 {


	public static void main(String[] args) {
	
//Array 1: Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]  
//Array 2: Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length] 
		
	//fizzArray(4) → [0, 1, 2, 3]	
	//fizzArray2(4) → ["0", "1", "2", "3"]	
	}
	
public static int[] fizzArray(int n) {

  int[] num = new int[n];
  
  for(int i = n; i>0; i--){
    
    num[i-1] = i-1;
    
  }
  
  return num;
}
	
public static String[] fizzArray2(int n) {
  String[] num = new String[n];
  
  for(int i=n; i>0; i--){
    
    num[i-1] = String.valueOf(i-1);
    
  }
  return num;
  
  
}
	
	
	
}
