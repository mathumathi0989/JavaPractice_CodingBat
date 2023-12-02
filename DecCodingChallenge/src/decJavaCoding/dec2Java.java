package decJavaCoding;

import java.util.Scanner;

public class dec2Java {

	/*
	 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
Expected Output :
Hello
Alexandra Abramov

2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110

3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16

4. Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13

5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125



	 
	 
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String fName = sc.next();
	String lName = sc.next();
	System.out.println("Hello\n"+fName + " " + lName);

	int fNo = sc.nextInt();
	int sNo = sc.nextInt();
	System.out.println(fNo + sNo);
	System.out.println(fNo/sNo);
	System.out.println(-5 + 8 * 6);
	System.out.println((55+9) % 9);
	System.out.println(20 + -3*5 / 8);
	System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	System.out.println(fNo * sNo);
	}

}
