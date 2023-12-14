package decJavaCoding;

public class dec13 {

	public static void main(String[] args) {
//String 1: Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
//String 2: Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
		
		System.out.println();//
		
		System.out.println(withoutX2("xHi") );// "Hi"
		System.out.println(withoutX2("Hxi"));// "Hi"
		System.out.println(withoutX2("Hi") );//"Hi"
		System.out.println(withoutX("xHix"));// "Hi"
		System.out.println(withoutX("xHi") );// "Hi"
		System.out.println(withoutX("Hxix") );//"Hxi"
		
	
	}


public static String withoutX2(String str) {
  int n = str.length();
if(str.length()>2){
  if(((str.charAt(0)=='x')) && (str.charAt(1)=='x')){
    return str.substring(2);
  }
  else if (str.charAt(1)=='x') {
  return str.substring(0,1)+str.substring(2);
  }
  else  if(str.substring(0,1).equals("x")) {
    return str.substring(1);
  }
  else return str;
}
else if(str.contains("x")){
  return "";
}
else return str;
}

	
public static String withoutX(String str) {
  
    if(str.length()<2){
    return "";
  }
  
  if(str.length()>=2){
  if((str.charAt(0)=='x')&&(str.charAt(str.length()-1)=='x')){
    return str.substring(1,str.length()-1);
  }
  else if(str.charAt(0)=='x'){
    return str.substring(1);
  }
  else if(str.charAt(str.length()-1)=='x'){
    return str.substring(0,str.length()-1);
  }
  }
   return str;
 
}
	
	
	
	

}
