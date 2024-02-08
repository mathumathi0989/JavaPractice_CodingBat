package February;

import java.util.List;

public class feb7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Lambda 1: Given a list of integers, return a list where each integer is multiplied with itself.
		//square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
//Lambda 2: Given a list of strings, return a list where each string has "*" added at its end.
		//addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
		
//Lambda 3: Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
		//copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
//Lambda 4: Given a list of strings, return a list where each string has "y" added at its start and end.
		//moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
//Lambda 5: Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
		//math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
//Lambda 6: Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
		//rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
//Lambda 7:Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
		//lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
//Lambda 8: Given a list of strings, return a list where each string has all its "x" removed.
		//noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
		
	}

	public static List<Integer> square(List<Integer> nums) {
  nums.replaceAll(n -> n*n);
  return nums;
}

public static List<String> addStar(List<String> strings) {
  strings.replaceAll(n -> n +"*");
  return strings;
}
	
public static List<String> copies3(List<String> strings) {
  strings.replaceAll(n -> n+n+n);
  return strings;
}

public static List<String> moreY(List<String> strings) {
  strings.replaceAll(n -> "y"+n+"y");
  return strings;
}
public static List<Integer> math1(List<Integer> nums) {
  nums.replaceAll( n -> (n+1) * 10);
  return nums;
}
public static List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll( n -> n%10);
  return nums;
}
public static List<String> lower(List<String> strings) {
  strings.replaceAll(n-> n.toLowerCase());
  return strings;
}

public static List<String> noX(List<String> strings) {
  strings.replaceAll(n -> n.replace("x", ""));
  return strings;
}

}
