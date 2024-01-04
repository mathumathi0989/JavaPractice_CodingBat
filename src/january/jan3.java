package january;

public class jan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
		System.out.println(endOther("Hiabc", "abc"));
	System.out.println(bobThere("abcbob"));
		// true	
		//true
		
	}
	
	public static boolean endOther(String a, String b) {
  
  String c = a.toLowerCase();
  String d = b.toLowerCase();
  
  int c1 = c.length();
  int d1 = d.length();
  
  if(c1<d1){
  if(c.equals(d.substring(d.length()-c1,d.length()))){
    return true;
  }
  return false;
  }
  else {
    if(d.equals(c.substring(c.length()-d1,c.length()))){
    return true;
  }
  }
  return false;
}

	public static boolean bobThere(String str) {
  if(str.length()>=3){
    for(int i=0; i<str.length()-2; i++){
      if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
        return true;
      }
    }
  }
  return false;
}


}
