package january;

public class jan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
	System.out.println(endOther("Hiabc", "abc"));
		// true	
		
		
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

	

}
