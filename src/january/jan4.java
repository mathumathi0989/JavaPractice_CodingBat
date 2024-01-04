package january;

public class jan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

		System.out.println(xyzThere("abcxyz"));
		System.out.println(mixString("abc", "xyz"));
		System.out.println(repeatEnd("Hello", 3));
		// "llollollo"
		// true
		// "axbycz"
		
	}

	public static boolean xyzThere(String str) {
  
if(str.length()<3){
  return false;
}

if("xyz".equals(str) || str.startsWith("xyz") ) {
  return true;
}
 
  for(int i=0; i<str.length()-3; i++) {
  if ( str.charAt(i)!='.' 
  && str.charAt(i+1)=='x' 
  && str.charAt(i+2)=='y' 
  && str.charAt(i+3)=='z' ){
  return true;  
  }
  }
  
return false;
  

}
public static String mixString(String a, String b) {
  
  int a1 = a.length();
  int b1 = b.length();
  String c = "";
  if(a1==b1){
    for(int i=0; i<a1;i++){
      c = c + a.charAt(i)+b.charAt(i);
    }
    return c;
  }
  else if(a1>b1){
    for(int i=0; i<b1; i++){
      c = c + a.charAt(i)+b.charAt(i);
    }
    return c + a.substring(b1,a1);
  }
  else {
    for(int i=0; i<a1; i++){
      c = c + a.charAt(i)+b.charAt(i);
    }
    return c + b.substring(a1,b1);
  }
 
  
}
public static String repeatEnd(String str, int n) {
  String s = "";
  for(int i = 0; i<str.length() ; i++){
    
  if(i<n){
    s = s + str.substring(str.length()-n,str.length());
  }
  }
  return s;
  
}

	
}
