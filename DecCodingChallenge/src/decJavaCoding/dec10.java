package decJavaCoding;

public class dec10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String1: Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
//String2: Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
//String3: Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
//String4: Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
//String5: Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
				
		
		
		System.out.println();//
		System.out.println(twoChar("java", 0) );// "ja"
		System.out.println(twoChar("java", 2) );// "va"
		System.out.println(twoChar("java", 3));// "ja"
		
		System.out.println(middleThree("Candy"));// "and"
		System.out.println(middleThree("and"));// "and"
		System.out.println(middleThree("solving") );//"lvi"
		
		System.out.println(hasBad("badxx"));// true
		System.out.println(hasBad("xbadxx"));//true
		System.out.println(hasBad("xxbadxx") );// false
		
		System.out.println(atFirst("hello"));// "he"
		System.out.println(atFirst("hi") );// "hi"
		System.out.println(atFirst("") );// "@@"
		
		System.out.println(lastChars("last", "chars") );// "ls"
		System.out.println(lastChars("yo", "java") );// "ya"
		System.out.println(lastChars("hi", "") );// "h@"
		
	}

	public static String twoChar(String str, int index) {
		   
		 if (str.length() <= index + 1 || index < 0)
		    return str.substring(0,2);

		  else
		    return str.substring(index, index + 2);
		  
		  
		}

	public static String middleThree(String str) {
		  
		  if (str.length()>3){
		    int value = (str.length()-3)/2;
		    return str.substring(value,str.length()-value);
		    
		  }
		  else return str;
		}
	
	public static boolean hasBad(String str) {
		  if((str.length()>3) && ((str.substring(0,3).equals("bad")) || (str.substring(1,4).equals("bad"))))
		  {
		    return true;
		  }
		  else if ((str.length()==3) &&(str.substring(0,3).equals("bad")))
		  {
		    return true;
		  }
		  else return false;
		}

	public static String atFirst(String str) {
		  
		  if(str.length()>=2){
		    return str.substring(0,2);
		  }
		  else if(str.length()==0){
		    return "@@";
		  }
		  
		 else  return str.substring(0)+"@";
		  
		  
		}
	
	public static String lastChars(String a, String b) {
		  if ((a.length()==0) && (b.length()>1)) {
		    return "@"+b.substring(b.length()-1,b.length());
		  }
		  else if ((a.length()>1) && (b.length()==0)){
		    return a.substring(0,1)+"@";
		  }
		  else if ((a.length()==0) && (b.length()==0)){
		    return "@"+"@";
		    
		  }
		  
		  else {return a.substring(0,1)+b.substring(b.length()-1,b.length());
		  }
		}
	
}
