package decJavaCoding;

public class dec16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//logic 1: Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
//logic 2: Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
//logic 3: Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//logic 4: Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
//logic 5: Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.



		System.out.println();//
		
System.out.println(old35(3) );// true
System.out.println(old35(10) );//true
System.out.println(old35(15));//false

System.out.println(less20(18) );// true
System.out.println(less20(19) );// true
System.out.println(less20(20)  );// false
		
System.out.println(nearTen(12));// true
System.out.println(nearTen(17) );//false
System.out.println(nearTen(19));//true	

System.out.println(teenSum(3, 4) );// 7
System.out.println(teenSum(10, 13));// 19
System.out.println(teenSum(13, 2));// 19
		
System.out.println(answerCell(false, false, false) );// true
System.out.println(answerCell(false, false, true) );// false
System.out.println(answerCell(true, false, false) );// false		
		
		
	}
	
	

public static boolean old35(int n) {
  
  if((n%3==0) && (n%5==0)){
  return false;
  }
  else if((n%3==0) || (n%5==0)){
    return true;
  }
  return false;
  
}
public static boolean less20(int n) {
  
  if(((n+1)%20==0)||((n+2)%20==0)){
    return true;
  }
  return false;

}

public static boolean nearTen(int num) {
  
if((num%10<=2)||((num+1)%10==0) || ((num+2)%10==0)) {
  return true;
}
  return false;
  
}

public static int teenSum(int a, int b) {
  
  if((a>=13 && a<=19)||(b>=13 && b<=19)){
    return 19;
  }
  else return a+b;
  
}

public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
 if (isAsleep)
    return false;
  if ((isMorning && isMom) || !isMorning)
    return true;
  else return false;

}


}
