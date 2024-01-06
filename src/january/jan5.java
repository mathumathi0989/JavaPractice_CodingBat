package january;

public class jan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
//A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
//Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

		System.out.println(prefixAgain("abXYabc", 1)  );
		System.out.println(getSandwich("breadjambread"));
		System.out.println(oneTwo("tcagdo"));
//true
	//"jam"
	// "catdog"
	
	}
public static boolean prefixAgain(String str, int n) {

if(str.length()>1){
String s1 = str.substring(0,n);
String s2 = str.substring(n,str.length());
for(int i=n; i<str.length();i++){
if(s2.contains(s1)){
  return true;
} 
}
}
return false;

}

public static String getSandwich(String str) {
  
for(int i=0; i<str.length(); i++){
if(str.charAt(i)=='b' && str.charAt(i+1)=='r' && str.charAt(i+2)=='e' && str.charAt(i+3)=='a' && str.charAt(i+4)=='d') {
String s1 =  str.substring(i+5, str.length());
if(s1.length()>5){
  for(int j=s1.length(); j>0; j--){
  if(s1.charAt(j-4)=='b' && s1.charAt(j-3)=='r' && s1.charAt(j-2)=='e' && s1.charAt(j-1)=='a' && s1.charAt(j)=='d' ) {
              return s1.substring(0,j-4);
            }
       }
}
  }
  }
  return "";
}
public static String oneTwo(String str) {
  String s = "";
  if(str.length()>3){
    for(int i=0; i<str.length()-2; i=i+3){
    s = s +  str.charAt(i+1) +str.charAt(i+2)+str.charAt(i);
     
    }
  return s;
    
  }
  
  else if(str.length()==3){
    return str.substring(1,str.length())+str.substring(0,1);
  }
   return "";
}



}
