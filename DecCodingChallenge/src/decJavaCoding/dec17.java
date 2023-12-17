package decJavaCoding;

public class dec17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//logic 1: We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
//logic 2: Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
//logic 3: Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)
//logic 4: Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
//logic 5:Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
		
		
		System.out.println();//
		
System.out.println(teaParty(6, 8) );// 1
System.out.println(teaParty(3, 8));// 0
System.out.println(teaParty(20, 6) );// 2
System.out.println(fizzString("fig"));// "Fizz"
System.out.println(fizzString("dib"));// "Buzz"
System.out.println(fizzString("fib"));// "FizzBuzz"
System.out.println(fizzString2(1));//  "1!"
System.out.println(fizzString2(2) );// "2!"
System.out.println(fizzString2(3));//  "Fizz!"		
System.out.println(twoAsOne(1, 2, 3) );// true
System.out.println(twoAsOne(3, 1, 2) );// true
System.out.println(twoAsOne(3, 2, 2) );// false
System.out.println(inOrder(1, 2, 4, false) );//true
System.out.println(inOrder(1, 2, 1, false));// false
System.out.println(inOrder(1, 1, 2, true));// true


	}

	public static int teaParty(int tea, int candy) {
  
if(tea<5 || candy<5){
  return 0;
}
else if((tea>=(candy*2))||(candy>=(tea*2))){
  return 2;
}
else return 1;
}
	
	


public static  String fizzString(String str) {
  
  if((str.substring(str.length()-1,str.length()).equals("b")) && (str.substring(0,1).equals("f"))){
    return "FizzBuzz";
  }
  else if(str.substring(0,1).equals("f")){
    return "Fizz";
  }
  else if(str.substring(str.length()-1,str.length()).equals("b")){
    return "Buzz";
  }
  else return str;
  
}

public static String fizzString2(int n) {
  
  if((n%3==0) &&(n%5==0)){
    return "FizzBuzz!";
  }
  else if(n%3==0){
    return "Fizz!";
  }
  else if(n%5==0){
    return "Buzz!";
  }
  else return n+"!";
  
}


public static boolean twoAsOne(int a, int b, int c) {
  
  if((a+b==c)||(b+c==a)||(a+c==b)){
    return true;
  }
  else return false;
  
}

public static boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk==false && ((b>a)&&(c>b)))
 {
    return true;
  }
  else if(bOk==true && (c>b)){
    return true;
  }
  else return false;

}



}
