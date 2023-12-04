package decJavaCoding;

public class dec4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	Warm up 1: 
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

Warm up 2: Given 2 int values, return true if either of them is in the range 10..20 inclusive.

Warm up 3: 
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

Warm up 4:
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


Warm up 5: 
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.



		 */
		
		
		System.out.println(icyHot(120, -1));// true
		System.out.println(icyHot(-1, 120));// true
		System.out.println(icyHot(-1, 100));// false
		System.out.println(icyHot(2, 120));// false
		
		System.out.println(in1020(12, 99));// true
		System.out.println(in1020(21, 12));// true
		System.out.println(in1020(8, 99));// false
		
		System.out.println(hasTeen(13, 20, 10));// true
		System.out.println(hasTeen(20, 19, 10)); //true
		System.out.println(hasTeen(20, 10, 13)); // true
		System.out.println(hasTeen(1, 20, 12));// false
		
		System.out.println(loneTeen(13, 99));// true
		System.out.println(loneTeen(21, 19));// true
		System.out.println(loneTeen(13, 13));// false
		
		
		System.out.println(delDel("adelbc") );// "abc"
		System.out.println(delDel("adelHello"));// "aHello"
		System.out.println(delDel("adedbc"));// "adedbc"
		
		
	}
	
	
	public static boolean icyHot(int temp1, int temp2) {
		  if ((temp1 <0 && temp2 >100) || (temp1 >100 & temp2 <0)){
		    
		    return true;
		    
		  }
		  else return false;
		}

	
	public static boolean in1020(int a, int b) {
		  
		  if ((a>=10 && a<=20) || (b<=20 && b>=10))
		  {
		    return true;
		  }
		  
		  else return false;
		  
		  
		}
	
	
	public static boolean hasTeen(int a, int b, int c) {
		  
		  if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)) {
		    return true;
		  }
		  else return false;
		  
		  
		}
	
	public static boolean loneTeen(int a, int b) {
		  
		boolean aT = (a>=13 && a<=19);
		boolean bT = (b>=13 && b<=19);

		if((!aT&&bT) || (aT&&!bT)){
		  return true;
		}
		else return false;

		}

	public static String delDel(String str) {
		 
		 
		  if (str.length()>=4 && str.substring(1,4).equals("del")){
		    return  str.substring(0,1) + str.substring(4);
		  }
		  
		  return str;
		  
		  
		}

	

}
