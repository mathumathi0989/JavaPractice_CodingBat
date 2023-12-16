package decJavaCoding;

public class dec15_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//logic 1: When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
//logic 2: You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
//logic 3: The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
//logic 4: You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
//logic 5: Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
//logic 6: Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".		
//logic 7: The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
//logic 8: Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
//logic 9: We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod		
//logic 10: Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
		
		
		System.out.println();//
		System.out.println(cigarParty(30, false));//false
System.out.println(cigarParty(50, false));// true
System.out.println(cigarParty(70, true) );// true
		
System.out.println(dateFashion(5, 10) );// 2
System.out.println(dateFashion(5, 2) );// 0
System.out.println(dateFashion(5, 5) );// 1

System.out.println(squirrelPlay(70, false) );// true
System.out.println(squirrelPlay(95, false));//false
System.out.println(squirrelPlay(95, true) );// true
	

System.out.println(caughtSpeeding(60, false) );// 0
System.out.println(caughtSpeeding(65, false) );//1
System.out.println(caughtSpeeding(65, true));// 0


System.out.println(sortaSum(3, 4) );// 7
System.out.println(sortaSum(9, 4) );//20
System.out.println(sortaSum(10, 11) );//21

System.out.println(alarmClock(1, false) );// "7:00"
System.out.println(alarmClock(5, false)  );//"7:00"
System.out.println(alarmClock(0, false)  );// "10:00"

System.out.println(love6(6, 4) );// true
System.out.println(love6(4, 5));//false
System.out.println(love6(1, 5) );// true

System.out.println(in1To10(5, false));// true
System.out.println(in1To10(11, false) );// false
System.out.println(in1To10(11, true) );// true

System.out.println(specialEleven(22) );//  true
System.out.println(specialEleven(23) );//  true
System.out.println(specialEleven(24) );//  false

System.out.println(more20(20));//  false
System.out.println(more20(21));//  true
System.out.println(more20(22));// true


	}
	
	public static boolean cigarParty(int cigars, boolean isWeekend) {
  
  if(isWeekend==false){
    if (cigars<=60 && cigars>=40){
      return true;
    }
    else return false;
  } 
 
 else if(isWeekend==true && cigars<40){
   return false;
 }
  return true;
  
}
	
	public static int dateFashion(int you, int date) {
  
  if((you>=8 || date>=8) && (you<=2 || date<=2) ){
    return 0;
  }
  else if(you>=8 || date>=8){
    return 2;
  }
  else if(you<=2 || date<=2){
    return 0;
  }
  else return 1;
}

	
	public static boolean squirrelPlay(int temp, boolean isSummer) {
  
  if((isSummer==true) && (temp>=60 && temp<=100)){
    return true;
  }
  else if((isSummer==false) &&(temp>=60 && temp<=90)){
    return true;
  }
  else return false;
  
  
}
public static int caughtSpeeding(int speed, boolean isBirthday) {
 if(isBirthday==false){ 
  if(speed<=60){
  return 0;
  }
  else if(speed>=61 && speed<=80){
  return 1;
  }
  return 2;
  
 }
 else {
  if(speed<=65){
  return 0;
  }
  else if(speed>=66 && speed<=85){
  return 1;
  }
   return 2;
  
 }
  
  
}
public static int sortaSum(int a, int b) {
  
  int sum = a+b;

  if(sum>=10 && sum<=19){
    return 20;
  }
  else return sum;
  
}


public static String alarmClock(int day, boolean vacation) {
  
  if(vacation==true){
    if(day>=1 && day<=5){
       return "10:00";
        }
      else   return "off";
  }
  else if(vacation==false && day>=1 & day<=5){
    return "7:00";
  }
  else return "10:00";
}

	public static boolean love6(int a, int b) {
  
  
  if((a==6 || b==6) || (a+b == 6) ||(Math.abs(a-b)==6) ){
    return true;
  }
  return false;
  
}

	public static boolean in1To10(int n, boolean outsideMode) {
  
  if((outsideMode == true) && (n<=1 || n>=10))
  {
    return true;
  }
  else if((n>=1 && n<=10) && (outsideMode==false)){
    return true;
  }
  else return false;
    
}

public static boolean specialEleven(int n) {
 
  if((n%11==0) ||((n-1)%11==0)){
return true;
  }
  return false;
  
}
	
public static boolean more20(int n) {
  
  if (((n-1)%20==0) || ((n-2)%20==0)){
    return true;
  }
  return false;
  
}




}
