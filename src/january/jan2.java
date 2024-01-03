package january;

public class jan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String 1: Return true if the string "cat" and "dog" appear the same number of times in the given string.
//String 2: Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

System.out.println(catDog("catxdogxdogxca"));
System.out.println(countCode("aaacodebbb"));
// false
// 1git
	}
public static boolean catDog(String str) {
  int count1 = 0;
  int count2 = 0;
  if(str.length()>3){
  for(int i=0; i<str.length()-2;i++){
    if((str.charAt(i)=='c') && (str.charAt(i+1)=='a') && (str.charAt(i+2)=='t')){
      count1 = count1 + 1;
    }
  }
  
  for(int j=0; j<str.length()-2;j++){
    if(str.charAt(j)=='d' && str.charAt(j+1)=='o' && str.charAt(j+2)=='g'){
      count2 = count2 + 1;
    }
  }
  
  if(count1==count2){
    return true;
  }
  else return false;
  }
  else if(str.length()==3){
    return false;
  }
  return true;
}


public static int countCode(String str) {
   int count = 0;

  for(int i = 0; i<str.length()-3; i++ ){
    
    if( str.charAt(i) == 'c'   && 
        str.charAt(i+1) == 'o' &&
        str.charAt(i+3) =='e' )
        {
            count +=1; 
        }  
    
  }
  return count;
}



}
