package decJavaCoding;

public class dec5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 
 Warm up 1: 
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

 Warm up 2:
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz"

 Warm up 3: 
 Given three int values, a b c, return the largest.
 
 Warm up 4: 
 Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 
 Warm up 5:
 Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
 
 
 */
		
		System.out.println(mixStart("mix snacks"));// true
		System.out.println(mixStart("pix snacks"));// true
		System.out.println(mixStart("piz snacks"));// false	
		
		System.out.println(startOz("ozymandias"));// "oz"
		System.out.println(startOz("bzoo"));// "z"
		System.out.println(startOz("oxx"));// "o"
		
		System.out.println(intMax(1, 2, 3));// 3
		System.out.println(intMax(1, 3, 2));// 3
		System.out.println(intMax(3, 2, 1));// 3
		
		System.out.println(close10(8, 13));// 8
		System.out.println(close10(13, 8));// 8
		System.out.println(close10(13, 7));// 0
		
		System.out.println(in3050(30, 31));// true
		System.out.println(in3050(30, 41));// false
		System.out.println(in3050(40, 50));// true
		
	}

	public static boolean mixStart(String str) {
		if ((str.startsWith("ix",1)) && (str.length()>=3)){
		  return true;
		}
		else return false;
		}

	
	public static String startOz(String str) {
		   String result = ""; 
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  return result;
		}

	public static int intMax(int a, int b, int c) {
		  
		  if((a>b) && (a>c)){
		    return a;
		  }
		  else if((b>c)&&(b>a)) {
		    return b;
		  }
		  else return c;
		  
		  
		}

	public static int close10(int a, int b) {
		  
		  int aD = Math.abs(a - 10);
		  int bD = Math.abs(b-10);
		  
		  if(aD<bD){
		    return a;
		  }
		  else if(aD>bD){
		    return b;
		  } 

		  else return 0;
		  
		  
		}
	public static boolean in3050(int a, int b) {
		if ((a>=30 && a<=40) && (b>=30 && b<=40)) {
		  return true;
		}

		if ((a>=40 && a<=50) && (b>=40 && b<=50)) {
		  return true;
		}
		return false;
		  
		}

	
}
