package decJavaCoding;

public class dec8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String 1: Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".				
		
		
		System.out.println(helloName("Bob"));// "Hello Bob!"
		System.out.println(helloName("Alice") );// "Hello Alice!"
		System.out.println(helloName("X"));// "Hello X!"
		
		System.out.println(makeAbba("Hi", "Bye"));// "HiByeByeHi"
		System.out.println(makeAbba("Yo", "Alice") );//"YoAliceAliceYo"
		System.out.println(makeAbba("What", "Up"));// "WhatUpUpWhat"
		
		System.out.println(makeTags("i", "Yay"));//"<i>Yay</i>"
		System.out.println(makeTags("i", "Hello") );// "<i>Hello</i>"
		System.out.println(makeTags("cite", "Yay") );// "<cite>Yay</cite>"
		
		System.out.println(makeOutWord("<<>>", "Yay"));//"<<Yay>>"
		System.out.println(makeOutWord("<<>>", "WooHoo") );//"<<WooHoo>>"
		System.out.println(makeOutWord("[[]]", "word"));// "[[word]]"
		
		System.out.println(extraEnd("Hello") );// "lololo"
		System.out.println(extraEnd("ab") );// "ababab"
		System.out.println(extraEnd("Hi"));// "HiHiHi"
		
		System.out.println(firstTwo("Hello"));// "He"
		System.out.println(firstTwo("abcdefg"));//"ab"
		System.out.println(firstTwo("ab") );// "ab"
		
		System.out.println(firstHalf("WooHoo"));// "Woo"
		System.out.println(firstHalf("HelloThere"));// "Hello"
		System.out.println(firstHalf("abcdef") );// "abc"
		
		
	}
	
	public static String helloName(String name) {
		  return "Hello " + name + "!";
		}
	
	
	public static String makeAbba(String a, String b) {
		  return a+b+b+a;
		}

	public static String makeTags(String tag, String word) {
		  return "<"+tag+">"+word+"</"+tag+">";
		}

	public static String makeOutWord(String out, String word) {
		  String front = out.substring(0,2);
		  String back = out.substring(2,out.length());
		  return front+word+back;
		  
		}

	public static String extraEnd(String str) {
		  if(str.length()>2){
		  String last = str.substring(str.length()-2,str.length());
		  return last+last+last;
		  }
		  else return str+str+str;
		}
	public static String firstTwo(String str) {
		  
		  if(str.length()>2){
		    return str.substring(0,2);
		  }
		  else return str;
		  
		}
	
	public static String firstHalf(String str) {
		  int n = (str.length() / 2);
		  return str.substring(0,n);
		}

	
	

}
