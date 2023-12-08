package decJavaCoding;

public class dec7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Warm up 1: Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//Warm up 2: Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
//Warm up 3: Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

	

		
		
		
		
		System.out.println(stringTimes("Hi", 2));// "HiHi"
		System.out.println(stringTimes("Hi", 3));// "HiHiHi"
		System.out.println(stringTimes("Hi", 1));// "Hi"	
		
		System.out.println(frontTimes("Chocolate", 2));// "ChoCho"
		System.out.println(frontTimes("Chocolate", 3));// "ChoChoCho"
		System.out.println(frontTimes("Abc", 3));// "AbcAbcAbc
		System.out.println(frontTimes("A", 4) );// "AAAA"
		
	}
	
	
	
	public static String stringTimes(String str, int n) {
		  String s = "";
		  for (int i=1; i<=n; i++){
		    s = s + str;
		  }
		  return s;  
		  
		}
	public static String frontTimes(String str, int n) {
		  String s = "";
		 if(str.length()>=3){
		     String s1 = str.substring(0,3);
		  for (int i=1; i<=n; i++){
		    
		    s = s + s1;
		  }
		  return s;
		  }
		  else {
		    for (int j=1; j<=n; j++){
		    s = s + str;
		  }
		  return s;
		  }
		  
		  
		  
		  
		  
		}
	
	

}
