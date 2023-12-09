package decJavaCoding;

public class dec9 {

	
	
	public static void main(String[] args) {

//String 1: Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
//String 2: Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0)
//String 3: Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//String 4: Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
//String 5: Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
//String 6: Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
//String 7: Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
//String 8: Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
//String 9: Given a string, return true if it ends in "ly".
//String 10: Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
		
				
				
		
		System.out.println(withoutEnd("Hello") );// "ell"
		System.out.println(withoutEnd("java") );// "av"
		System.out.println(withoutEnd("coding") );//  "odin"
		
		System.out.println(comboString("Hello", "hi")  );// "hiHellohi"
		System.out.println(comboString("hi", "Hello")  );// "hiHellohi"
		System.out.println(comboString("aaa", "b") );// "baaab"
		
		System.out.println(nonStart("Hello", "There")  );// "ellohere"
		System.out.println(nonStart("java", "code") );// "avaode"
		System.out.println(nonStart("shotl", "java")  );// "hotlava"
		
		System.out.println(left2("Hello") );//"lloHe"
		System.out.println(left2("java")  );// "vaja"
		System.out.println(left2("Hi")  );// "Hi"
		
		
		System.out.println(right2("Hello")  );// "loHel"
		System.out.println(right2("java")  );// "vaja"
		System.out.println(right2("Hi")  );// "Hi"
		
		System.out.println(theEnd("Hello", true)  );//"H"
		System.out.println(theEnd("Hello", false)  );//"o"
		System.out.println(theEnd("oh", true)  );// "o"

		
		System.out.println(withouEnd2("Hello") );// "ell"
		System.out.println(withouEnd2("abc")  );// "b"
		System.out.println(withouEnd2("ab")  );// ""
		
		System.out.println(middleTwo("string") );// "ri"
		System.out.println(middleTwo("code")  );// "od"
		System.out.println(middleTwo("Practice")  );// "ct"
		
		System.out.println(endsLy("oddly")  );// true
		System.out.println(endsLy("y")  );// false
		System.out.println(endsLy("oddy")  );// false
		
		System.out.println(nTwice("Hello", 2) );// "Helo"
		System.out.println(nTwice("Chocolate", 3));// "Choate"
		System.out.println(nTwice("Chocolate", 1)  );// "Ce"
		
		
		
	}
	
	public static String withoutEnd(String str) {
		  
		  return str.substring(1,str.length()-1);
		  
		  
		}
	
	public static String comboString(String a, String b) {
		  
		  if(a.length()>b.length()){
		    return b+a+b;
		  }
		  else return a+b+a;
		  
		  
		}

	public static String nonStart(String a, String b) {
		  
		  return a.substring(1,a.length()) + b.substring(1,b.length());
		  
		  
		}
	
	public static String left2(String str) {
		  
		  return str.substring(2,str.length())+str.substring(0,2);
		  
		}
	public static String right2(String str) {
		  
		  if(str.length()>2){
		    return str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
		  }
		  else return str;
		  
		}
	
	public static String theEnd(String str, boolean front) {
		  
		  if (front == true){
		    return str.substring(0,1);
		  }
		  else 
		  {
		    return str.substring(str.length()-1, str.length());
		  }
		  
		  
		}
	
	public static String withouEnd2(String str) {
		  
		  if(str.length()>2){
		    return str.substring(1,str.length()-1);
		  }
		  else return "";
		  
		  
		}
	public static String middleTwo(String str) {
		  int n = str.length()/2;
		  if(str.length()>2){
		    return str.substring(n-1,n+1);
		    
		  }
		  else return str;
		  
		  
		}
	public static boolean endsLy(String str) {
		  if(str.length()>=2){
		  String s = str.substring(str.length()-2, str.length());
		  if(s.equals("ly")){
		    return true;
		  }
		  else return false;
		  }
		  else return false;
		  
		  
		}
	
	
	public static String nTwice(String str, int n) {
		  return str.substring(0,n)+str.substring(str.length()-n,str.length());
		  
		}
	
	
}
