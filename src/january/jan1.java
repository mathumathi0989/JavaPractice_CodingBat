package january;

public class jan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given a string, return a string where for every char in the original, there are two chars.
		
		//doubleChar("The") → "TThhee"
		
		
		
	}

	
public static String doubleChar(String str) {

String s1 = "";

for(int i=0; i<str.length(); i++){
  
  s1 = s1 + str.charAt(i)+str.charAt(i);
}
return s1;


}
	
}
