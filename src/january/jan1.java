package january;

public class jan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String 1: Return the number of times that the string "hi" appears anywhere in the given string.

System.out.println(countHi("abc hi ho"));
 // 1
		
	}

public static int countHi(String str) {
  
  int count = 0;
  if(str.length()>1){
for(int i=0; i<str.length(); i++){
   if((str.charAt(i)==('h')) && (str.charAt(i+1)==('i'))){
       count = count + 1;
   }
}
  return count;
  }
  return 0;
}

	
}
