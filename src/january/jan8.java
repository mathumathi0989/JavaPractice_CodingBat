package january;

public class jan8 {

	public static void main(String[] args) {

		//Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
		System.out.println(xyzMiddle("AxyzBB") );
		//true
		
		
	}
	
	public static  boolean xyzMiddle(String str) {

int n =  str.length()/2; 
if (str.length()<3){
  return false;
}

if(n%2==0){
  if((str.substring(n-1,n+2).equalsIgnoreCase("xyz")) || (str.substring(n-2,n+1).equalsIgnoreCase("xyx"))){
      return true;
    }
   else{
     return false;
   } 
  }
else if(str.substring(n-1,n+2).equalsIgnoreCase("xyz")){
    return true;
    }
  

return false;


}

}
