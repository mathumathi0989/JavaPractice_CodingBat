package decJavaCoding;

import java.util.Arrays;

public class dec19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//logic 1: You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
//logic 2: Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
//logic 3: Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
//Array 1: 	Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//Array 2: Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//Array 3: Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
//Array 4: Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
//Array 5: Given an array of ints length 3, return the sum of all the elements.
		
	
		System.out.println();//
		
		
System.out.println(blueTicket(9, 1, 0));//10
System.out.println(blueTicket(9, 2, 0));// 0
System.out.println(blueTicket(6, 1, 4) );//10
System.out.println(shareDigit(12, 23) );// true
System.out.println(shareDigit(12, 43) );// false
System.out.println(shareDigit(12, 44) );// false		
System.out.println(sumLimit(2, 3)  );// 5
System.out.println(sumLimit(8, 3)  );// 8
System.out.println(sumLimit(8, 1) );// 9	

//int[] nums = {1, 2, 6}; //true
int[] nums = {1, 1, 2, 1}; //true
//int[] nums = {6, 1, 2, 3}; //false
//System.out.println(firstLast6(nums));// true

System.out.println(sameFirstLast(nums));// true

System.out.println(Arrays.toString(makePi()));

int[] a = {1, 2, 3} ; int[] b = {7, 3};
System.out.println(commonEnd(a,b));
int[] sum3 = {1, 2, 3} ;
System.out.println(sum3(sum3));



	}



public static int blueTicket(int a, int b, int c) {
  int ab = a+b;
  int bc = b+c;
  int ca= c+a;
  if((ab==10) ||(bc==10) || (ca==10)){
    return 10;
  }
  else if ((ab-bc==10)||(ab-ca==10)){
    return 5;
  }
  return 0;
}

public static boolean shareDigit(int a, int b) {
  int al= a/10;
  int bl = b/10;
  int ar=a%10;
  int br = b%10;
  
  if((ar==bl)||(al==br)||(ar==br)||(al==bl)){
    return true;
  }

  return false;

}
public static int sumLimit(int a, int b) {
  
  String sum = Integer.toString(a+b);
  String a1 = Integer.toString(a);
  
 if(sum.length()==a1.length()){
    return a+b;
  }
  else return a;
  
}

public static boolean firstLast6(int[] nums) {
  

    if((nums[0]==6)||(nums[nums.length-1]==6)){
      return true;
    }
    else return false;
  
}

public static  boolean sameFirstLast(int[] nums) {
if(nums.length>=1){
  if(nums[0]==nums[nums.length-1]){
  return true;
  }
  }
  return false;
}

public static int[] makePi() {
  int[] makePi = {3,1,4};
  return makePi;
}

public static boolean commonEnd(int[] a, int[] b) {
  
  if((a[0]==b[0])||(a[a.length-1]==b[b.length-1])){
    return true;
  }
  return false;
  
}
public static int sum3(int[] nums) {
  int sum = 0;
  for(int i=0; i<nums.length; i++){
    sum = sum+nums[i];
  }
  return sum;

}


}
