package decJavaCoding;

public class dec14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String 1: Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.		
//String 2: Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

	
		System.out.println();//
	System.out.println(deFront("Hello"));// "llo"
	System.out.println(deFront("java"));// "va"
	System.out.println(deFront("away"));// "aay"
	System.out.println(startWord("hippo", "hi") );// "hi"
	System.out.println(startWord("hippo", "xip") );// "hip"
	System.out.println(startWord("hippo", "i") );// "h"

		
	}
	
public static String deFront(String str) {    

if(str.length()>=2){
if((str.charAt(0)!='a')&&(str.charAt(1)!='b')){
return str.substring(2);
}
else if((str.charAt(0)=='a')&&(str.charAt(1)=='b')){
return "a"+"b" + str.substring(2);
}
else if(str.charAt(0)=='a'){
  return "a"+str.substring(2);
}
else if(str.charAt(1)=='b'){
  return "b"+str.substring(2);
}
return str.substring(2);
}
return "";
}


public static String startWord(String str, String word) {

 int lenStr = str.length();
  int lenWord = word.length();

if (lenStr == 0)
return "";

if (lenWord > lenStr)
    return "";

if (word.length() == 1)
    return str.substring(0,1);
    
else if (str.substring(1,lenWord).equals(word.substring(1,lenWord)))
    return str.substring(0,lenWord);
else
    return "";
 
}
	

}
