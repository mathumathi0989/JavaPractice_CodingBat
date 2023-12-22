package decJavaCoding;

public class dec21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//logic 1: We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops
//logic 2: Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
//logic 3: Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
//logic 4: Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
//logic 5: Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

		
		
		
		System.out.println();//
System.out.println(makeBricks(3, 1, 8));// true
System.out.println(makeBricks(3, 1, 9) );//false
System.out.println(makeBricks(3, 2, 10));// true
System.out.println(loneSum(1, 2, 3) );// 6
System.out.println(loneSum(3, 2, 3));// 2
System.out.println(loneSum(3, 3, 3) );// 0
System.out.println(luckySum(1, 2, 3) );//6
System.out.println(luckySum(1, 2, 13)  );//3
System.out.println(luckySum(1, 13, 3)  );// 1
System.out.println(closeFar(1, 2, 10) );// true
System.out.println(closeFar(1, 2, 3));// false
System.out.println(closeFar(4, 1, 3));// true
System.out.println(evenlySpaced(2, 4, 6));// true
System.out.println(evenlySpaced(4, 6, 2) );//true
System.out.println(evenlySpaced(4, 6, 3));// false

	}

	public static boolean makeBricks(int small, int big, int goal) {
 
 if (goal > (small + big*5)){
   return false;
 }

if (goal% 5 > small){
   return false;
 }

 return true;
 
}
	
public static  int loneSum(int a, int b, int c) {
  if (a==b && b==c){
    return 0;
  }
  else if(a==b){
    return c;
  }
  else if (b==c){
    return a;
  }
  else if(c==a){
    return b;
  }

  else return a+b+c;
}
public static int luckySum(int a, int b, int c) {
  if(a==13){
    return 0;
  }
  else if(b==13){
    return a;
  }
  else if(c==13){
    return a+b;
  }
  return a+b+c;
}

public static boolean closeFar(int a, int b, int c) {

  if(Math.abs(b-a)<=1 && Math.abs(c-a)>=2 && Math.abs(b-c)>=2){
    return true;
  }
  else if(Math.abs(c-a)<=1 && Math.abs(b-a)>=2 && Math.abs(b-c)>=2){
    return true;
  }

  else return false;
  
}
public static boolean evenlySpaced(int a, int b, int c) {
  if ((b-a==c-b)||(b-a==a-c)||(a-c==c-b)){
    return true;
  }
  return false;
}


}
