package decJavaCoding;

public class dec6 {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Warm up 1: 
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

Warm up 2:
Return true if the given string contains between 1 and 3 'e' chars.

Warm up 3: Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

Warm up 4: 
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

Warm up 5: 
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.



 */
		
		System.out.println(max1020(11, 19));// 19
		System.out.println(max1020(19, 11));// 19
		System.out.println(max1020(11, 9));// 11	
		
		System.out.println(stringE("Hello")); //true
		System.out.println(stringE("Heelle")); // true
		System.out.println(stringE("Heelele")); // false
		
		System.out.println(lastDigit(7, 17)); // true
		System.out.println(lastDigit(6, 17)); // false
		System.out.println(lastDigit(3, 113) ); // true
		
		System.out.println(endUp("Hello")); //"HeLLO"
		System.out.println(endUp("hi there") ); // "hi thERE"
		System.out.println(endUp("hi")); // "HI"
		
		System.out.println(everyNth("Miracle", 2)); // "Mrce"
		System.out.println(everyNth("abcdefg", 2)); // "aceg"
		System.out.println(everyNth("abcdefg", 3)); // "adg"
		
	}

	
	public static int max1020(int a, int b) {
		  
		 
		if (a>b){
		  if (a>=10 && a<=20) {
		       return a;
		     }
		  else if ((b>=10 && b<=20) ) {
		    return b; }
		  else return 0;
		}
		else{
		  if (b>=10 && b<=20) {
		      return b;
		    }
		  else if (a>=10 && a<=20) {
		  return a;
		  }
		  else return 0;
		}

		}
	
	public static boolean stringE(String str) {
		  
		  char a = 'e';
		  int count = 0;
		  
		  for( int i=0; i<str.length(); i++){
		   if (str.charAt(i) == a){
		    count ++;
		   }
		  }
		  if(count>=1 && count <=3){
		    return true;
		  }
		  else return false;
		  
		}

	
	public static boolean lastDigit(int a, int b) {
		  int aM = a%10;
		  int bM = b%10;
		  
		  if(aM==bM) return true;
		  else return false;
		  
		  
		  
		}

	
	public static String endUp(String str) {
		  
		 
		if (str.length() <= 3)  return str.toUpperCase();
		 

		 String front = str.substring(0,str.length() - 3);
		 String back = str.substring(str.length() - 3);

		return (front + back.toUpperCase());
		 

		}

	public static String everyNth(String str, int n) {
		  
		  String result = "";
		  
		  for(int i=0; i<str.length(); i=i+n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		  
		  
		}


	
	
	
	
	
}
