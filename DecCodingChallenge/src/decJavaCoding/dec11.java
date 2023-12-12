package decJavaCoding;

public class dec11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String 1: Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
//String 2: Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
//String 3: Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
//String 4: Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
//String 5: Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
//String 6: Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
//String 7: Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
		

		
		System.out.println(conCat("abc", "cat") );// "abcat"
		System.out.println(conCat("dog", "cat"));// "dogcat"
		System.out.println(conCat("abc", ""));// "abc"
		System.out.println(lastTwo("coding"));// "codign"
		System.out.println(lastTwo("cat") );// "cta"
		System.out.println(lastTwo("ab"));// "ba"
		System.out.println(seeColor("redxx") );// "red"
		System.out.println(seeColor("xxred"));//""
		System.out.println(seeColor("blueTimes") );//"blue"
		System.out.println(frontAgain("edited"));// true
		System.out.println(frontAgain("edit"));// false
		System.out.println(frontAgain("ed") );// true
		System.out.println(minCat("Hello", "Hi")  );// "loHi"
		System.out.println(minCat("Hello", "java") );// "ellojava"
		System.out.println(minCat("java", "Hello") );//"javaello"
		System.out.println(extraFront("Hello") );// "HeHeHe"
		System.out.println(extraFront("ab") );// "ababab"
		System.out.println(extraFront("H") );//"HHH"
		System.out.println(without2("HelloHe") );// "lloHe"
		System.out.println(without2("HelloHi") );//"HelloHi"
		System.out.println(without2("Hi") );// ""



	}

	public static String conCat(String a, String b) {

		if(a.length() == 0 || b.length() == 0){
		  return a.concat(b);
		}
		else {
		if(a.substring(a.length()-1,a.length()).equals(b.substring(0,1))){
		  b = b.substring(1,b.length());
		  return a.concat(b);
		}
		else return a.concat(b);
		}


		}
	public static String lastTwo(String str) {
  
  if(str.length()>2){
    
return str.substring(0,str.length()-2)+str.substring(str.length() -1 )+str.substring(str.length()-2,str.length()-1);
    
    
  }
  else if(str.length()==2){
  
    return str.substring(1,str.length())+str.substring(0,1);
  }
  
  else  return str;
  
  
}

	
	public static String seeColor(String str) {
  if(str.matches("^red.*")){
    return "red";
  }
  else if(str.matches("^blue.*")){
    return "blue";
  }
  else return "";
}

	public static boolean frontAgain(String str) {
  if(str.length()>2){
    if ((str.substring(0,2).equals(str.substring(str.length()-2,str.length())))){
    return true;
      }
    else return false;
  }
  else if(str.length()<2){
    return false;
  }
  else  return true;

}
public static String minCat(String a, String b) {
  if(a.length()>b.length()){
    return (a.substring(a.length()-b.length(),a.length())).concat(b);
  }
  else if(b.length()>a.length()){
    return a.concat(b.substring(b.length()-a.length(),b.length()));
  }
  else return a.concat(b);
}

public static String extraFront(String str) {
  
  if(str.length()>2){
    return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
  }
  else return str+str+str;
  
}
public static String without2(String str) {
  
  if(str.length()>4) {
    if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
      return str.substring(2,str.length()-2)+str.substring(0,2);
    }
    else {
      return str;
    }
  }
  else if (str.length()==1){
    return str;
  }
  else if(str.length()==3 ){
    return str.substring(0,1);
  }
  else return "";
  
}

	
}
