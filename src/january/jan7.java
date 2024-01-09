package january;

public class jan7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String 1: We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
		System.out.println(xyBalance("aaxbby"));
	// → true
	}
public static boolean xyBalance(String str) {


    if(str.length() == 0  || "y".equals(str) )
        return true;

    int xIndex = str.lastIndexOf('x') ;

    if(xIndex<0)
        return true; // bbb case

    boolean foundY= false;
    // x must have Y AFTER ..
    for(int i = xIndex+1 ; i <= str.length()-1 ; i++  )
    {
        if('y' == str.charAt(i) )
            foundY=true;
    }
    return foundY ;
  
}

}
