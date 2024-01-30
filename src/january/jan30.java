package january;

public class jan30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Recursion 1: Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
//Recursion 2:The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
//Recursion 3: We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
//Recursion 4: We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
//Recursion 5: Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
		
		//factorial(3) → 6
		System.out.println(factorial(3));
		//fibonacci(7) → 13
		System.out.println(fibonacci(7));
		//bunnyEars2(6) → 15
		System.out.println(bunnyEars2(6));
		//triangle(2) → 3
		System.out.println(triangle(2));
	//sumDigits(126) → 9
		System.out.println(sumDigits(126));
		
	}
public static int factorial(int n) {
  if(n==1) return 1;

  return n * factorial(n-1);
  
}
public static int fibonacci(int n) {
  if (n == 0) return 0;
  else if (n == 1) return 1;
  return fibonacci(n-1) + fibonacci(n-2);
}

public static int bunnyEars2(int bunnies) {
  if (bunnies == 0) return 0;

  if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);

  else return 2 + bunnyEars2(bunnies-1);

}
public static int triangle(int rows) {
  if(rows==0) return 0;
  return rows+ triangle(rows-1);
}

public static int sumDigits(int n) {
  if(n==0) return 0;
  return n%10 + sumDigits(n/10);
  
}

}
