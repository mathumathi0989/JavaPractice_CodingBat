package decJavaCoding;

public class dec2 {

	
	
	public static void main(String[] args) {
		/* 
Warm up 1: The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
	We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
		
Warm up 2: We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble

Warm up 3: Given two int values, return their sum. Unless the two values are the same, then return double their sum.

Warm up 4: Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

Warm up 5: 
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

Warm up 6:
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


Warm up 7:
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


Warm up 8: 
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

Warm up 9:
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


Warm up 10:

Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

Warm up 11:

Given a string, return a new string where the first and last chars have been exchanged.
		*
		*/
	
		System.out.println(sleepIn(false, false));// true
		System.out.println(sleepIn(true, false));// false
		System.out.println(sleepIn(false, true)); //true
		
		System.out.println(monkeyTrouble(true, true));// true
		System.out.println(monkeyTrouble(false, false));// true
		System.out.println(monkeyTrouble(true, false));// false
		
		
		System.out.println(sumDouble(1, 2)); //3
		System.out.println(sumDouble(0, 0)); //0
		System.out.println(sumDouble(2, 2)); //8
		System.out.println(sumDouble(-1,0)); //-1
		
		
		System.out.println(diff21(25));//8
		System.out.println(diff21(10)); //11
		System.out.println(diff21(21)); //0
		System.out.println(diff21(-2)); //23
		System.out.println(diff21(0)); //21
		
		
		System.out.println(parrotTrouble(true, 6));// true
		System.out.println(parrotTrouble(true, 7));//false
		System.out.println(parrotTrouble(false, 6));//false
		
		
		System.out.println(makes10(9, 10));//true
		System.out.println(makes10(9, 9));//false
		System.out.println(makes10(1, 9));//true
		
		System.out.println(nearHundred(93)); //true
		System.out.println(nearHundred(90)); //true
		System.out.println(nearHundred(89)); //false
		System.out.println(nearHundred(-101)); //false
	
		
		System.out.println(posNeg(1, -1, false));// true
		System.out.println(posNeg(-1, 1, false)); //true
		System.out.println(posNeg(-4, -5, true));// true
		System.out.println(posNeg(-4, -5, false));// false
		
		System.out.println(notString("candy"));// "not candy"
		System.out.println(notString("x"));//"not x"
		System.out.println(notString("not bad"));// "not bad"
		
		
		System.out.println(missingChar("kitten", 1));// "ktten"
		System.out.println(missingChar("kitten", 0));// "itten"
		System.out.println(missingChar("kitten", 4));// "kittn"
		
		
		System.out.println(frontBack("code"));// "eodc"
		System.out.println(frontBack("a"));// "a"
		System.out.println(frontBack("ab"));//"ba"
		
		
	}
	
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if (!weekday || vacation) {
		    return true;
		  }
		  
		  return false;
		  
		  
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile & bSmile){
		  return true;
		}
		else if (!aSmile & !bSmile){
		  return true;
		}
		else 
		return false;
		}

	
	public static int sumDouble(int a, int b) {
		  int sum = a +b;
		  if (a==b){
		    sum = sum * 2;
		  }
		  return sum;
		}
	
	public static int diff21(int n) {
		 if(n<=21){
		   return 21 -n;
		 }
		 else {
		   return (n-21)*2;
		 }
		}
	
	
	public static boolean parrotTrouble(boolean talking, int hour) {
		 return (talking && (hour <7 || hour >20));
		  
		}

	public static boolean makes10(int a, int b) {
		 return (a==10 || b ==10 || a+b==10);
		}

	
	public static boolean nearHundred(int n) {
	    return ((Math.abs(100 - n) <= 10) ||
	    (Math.abs(200 - n) <= 10));
	}

	
	public static boolean posNeg(int a, int b, boolean negative) {
		if(negative){
		  return (a<0 && b <0);
		  
		}
		else 
		return ((a <0 && b >0 ) || (a>0 && b <0));
		}

	public static String notString(String str) {
		  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
	
	public static String missingChar(String str, int n) {
		  String s1 = str.substring(0,n);
		  String s2 = str.substring(n+1,str.length());
		  return s1 + s2;
		}
	
	public static String frontBack(String str) {
		  if (str.length() <= 1) return str;
		  
		  String mid = str.substring(1, str.length()-1);
		  
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}

	
	
	
}
