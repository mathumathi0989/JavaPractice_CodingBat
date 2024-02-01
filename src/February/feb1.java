package February;

public class feb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Recursion 1: Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
//Recursion 2: Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
//Recursion 3: Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
//Recursion 4: Given a string, compute recursively a new string where all the 'x' chars have been removed.

		
		//countHi("xhixhix") → 2
		System.out.println(countHi("xhixhix"));
		//changeXY("xhixhix") → "yhiyhiy"
		System.out.println(changeXY("xhixhix"));
		//changePi("pipi") → "3.143.14"
		System.out.println(changePi("pipi"));
		//noX("xaxb") → "ab"
		System.out.println(noX("xaxb"));
	}
	
	
	
public static int countHi(String str) {
  if(str.length()<2) return 0;
  if(str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(1));
  else return countHi(str.substring(1));
}

public static String changeXY(String str) {
  if(str.equals("")) return str;
  if(str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
  else return str.charAt(0) + changeXY(str.substring(1));
}
public static String changePi(String str) {
  if(str.length()<2 || str.equals("")) return str;
  if(str.charAt(0)=='p' && str.charAt(1)=='i') return "3.14" + changePi(str.substring(2));
  else return str.charAt(0) + changePi(str.substring(1));
}
public static String noX(String str) {
  if(str.equals("")) return str;
  if(str.charAt(0)=='x') return  noX(str.substring(1));
  else return str.charAt(0) + noX(str.substring(1));
}

 


}
