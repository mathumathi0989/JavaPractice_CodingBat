package decJavaCoding;

public class dec3 {

	
	public static void main(String[] args) {
		
	/*
Warm up 1: 
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

Warm up 2: Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

Warm up 3: 
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator


Warm up 4: Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

Warm up 5: 
Given a string, return true if the string starts with "hi" and false otherwis


	 */
		
		System.out.println(front3("Java")); //"JavJavJav"
		System.out.println(front3("Chocolate"));// "ChoChoCho"
		System.out.println(front3("abc"));// "abcabcabc"
		System.out.println(front3("a"));// "aaa"
		System.out.println(front3(""));// ""
		
		
		System.out.println(backAround("cat"));// "tcatt"
		System.out.println(backAround("Hello"));// "oHelloo"
		System.out.println(backAround("a"));// "aaa"
		
		
		System.out.println(or35(3)); // true
		System.out.println(or35(10));// true
		System.out.println(or35(8));//false
		
		
		System.out.println(front22("kitten"));//"kikittenki"
		System.out.println(front22("Ha"));// "HaHaHa"
		System.out.println(front22("abc"));// "ababcab"
		
		
		System.out.println(startHi("hi there"));// true
		System.out.println(startHi("hi"));// true
		System.out.println(startHi("hello hi"));// false
		
		
	}
	
	
	
	public static String front3(String str) {
		String front;
		 if(str.length() <= 2) {
		   front = str;
		 } 
		 else {
		   front = str.substring(0,3);

		 }
		 return front+front+front;
		 }
	
	public static String backAround(String str) {
		  if(str.length()>1){
		    String s1 = str.substring(str.length()-1);
		    return s1+str+s1;
		  }
		  else return str+str+str;
		}

	
	public static boolean or35(int n) {
		  if (n%3 == 0 || n%5 == 0){
		    return true;
		  }
		  else return false;
		}

	
	public static String front22(String str) {
		 String front;
		  if(str.length()<=2){
		    front = str;
		    
		  }
		  else {front  = str.substring(0,2);
		  }
		  return front + str + front;
		  
		}

	
	public static boolean startHi(String str) {
		  if(str.startsWith("hi")){
		    return true;
		  }
		  else return false;
		}	
	
	
	
	
	
	
	
	
	
	
	
	
}
