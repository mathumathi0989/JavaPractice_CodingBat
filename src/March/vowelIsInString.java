package March;

public class vowelIsInString {

	
	public static boolean vowelsPresent(String s) {
		
		
		return s.toLowerCase().matches(".*[aeiou].*");
		
		
	}
	public static void main(String[] args) {
		System.out.println(vowelsPresent("mtfv"));

	}

}
