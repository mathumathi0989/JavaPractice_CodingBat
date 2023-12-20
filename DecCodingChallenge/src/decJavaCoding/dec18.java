package decJavaCoding;

public class dec18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//logic 1: Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
//logic 2: Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
//logic 3: Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
//logic 4: Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
//logic 5: Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
//logic 6: You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
//logic 7: You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

		
		System.out.println();//
System.out.println(inOrderEqual(2, 5, 11, false));// true
System.out.println(inOrderEqual(5, 7, 6, false) );// false
System.out.println(inOrderEqual(5, 5, 7, true) );// true
	System.out.println(lastDigit(23, 19, 13));//true
System.out.println(lastDigit(23, 19, 12));//false
System.out.println(lastDigit(23, 19, 3) );// true	
System.out.println(lessBy10(1, 7, 11));// true
System.out.println(lessBy10(1, 7, 10));// false
System.out.println(lessBy10(11, 1, 7));// true		
System.out.println(withoutDoubles(2, 3, true) );// 5
System.out.println(withoutDoubles(3, 3, true));// 7
System.out.println(withoutDoubles(3, 3, false) );// 6
System.out.println(maxMod5(2, 3) );//3
System.out.println(maxMod5(6, 2) );// 6
System.out.println(maxMod5(3, 2));//3
System.out.println(redTicket(2, 2, 2) );// 10
System.out.println(redTicket(2, 2, 1) );// 0
System.out.println(redTicket(0, 0, 0) );// 5
System.out.println(greenTicket(1, 2, 3));//  0
System.out.println(greenTicket(2, 2, 2));//  20
System.out.println(greenTicket(1, 1, 2));//  10


	}
	
	
public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  
  if(equalOk == false){
    if(b>a && c>b){
      return true;
    }
    else  return false;
  }
  else if(equalOk == true){
    if((a==b && c>b)||(b==c && b>a) || (a==b && b==c)){
      return true;
    }
  }
  return false;

}
public static boolean lastDigit(int a, int b, int c) {
  
  if(a%10==b%10 || b%10==c%10 || a%10==c%10){
    return true;
  }
  return false;
  
}
public static boolean lessBy10(int a, int b, int c) {
  
  if(Math.abs(b-a)>=10 || Math.abs(c-a)>=10 || Math.abs(c-b)>=10 ){
    return true;
  }
  return false;
  
}
public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
  
  if(noDoubles==true){
    if(die1==die2){
      if(die1+die2 == 6){
        return 7;
      }
      else if(die1>=6){
        return die1+1;
      }
      else return die1+1+die2;
    }
    return die1+die2;
  }
  return die1+die2;
  
}

public static  int maxMod5(int a, int b) {
 
 if(a==b){
    return 0;
 }
  else if(a%5==b%5){
    if(a>b){
      return b;
    }
    return a;
 
  }
  else if(a>b){
    return a;
  }
  return b;
}

public static int redTicket(int a, int b, int c) {
  if((a==2) && (b==2) && (c==2)){
    return 10;
  }
  else if(a==b & b==c){
    return 5;
  }
  else if (b!=a && c!=a){
    return 1;
  }
  return 0;
  
}
public static int greenTicket(int a, int b, int c) {
  
if(a==b && b==c){
  return 20;
}  
else if(a==b || b==c || c==a){
  return 10;
}
  else return 0;
}


}