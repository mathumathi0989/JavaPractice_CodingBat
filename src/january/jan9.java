package january;

public class jan9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

		System.out.println(zipZap("azbcpzpp"));
		//"azbcpzp"

	}
	
	

public static String zipZap(String str) {
 
  int n = str.length();
 String s = "";
 
 if(n>=3){
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i)=='z' && str.charAt(i+2)=='p')
    {
         s = s + str.charAt(i)+str.charAt(i+2);
         i = i+2;
        }
   
    else{
       s = s+ str.charAt(i);
     }
 
  }
  
  return s;
  
}
return str;
}



}
