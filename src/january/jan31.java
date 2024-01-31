package january;

public class jan31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Recursion 1: Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
//Recursion 2: Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
		
		
		
		//powerN(3, 3) → 27
		System.out.println(powerN(3, 3));
		//countX("xhixhix") → 3
		System.out.println(countX("xhixhix"));
	}
	
	
	
public static int powerN(int base, int n) {
  if(n==0) return 1;
  return base * (powerN(base,n-1));
  
}

public static int countX(String str) {
  if(str.equals("")) return 0;
  if(str.charAt(0)=='x') return 1 + countX(str.substring(1));
  else return countX(str.substring(1));
  
}


}
