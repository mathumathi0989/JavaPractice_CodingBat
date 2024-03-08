package March;

import java.util.HashMap;
import java.util.Map;

public class countCharInString {

	
	public static void countChar(String s) {
		
		int totalNoOfChar = s.length();
		System.out.println("Total characters in the string is " +totalNoOfChar);
		
		
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			
			char[] charArray = s.toCharArray();
			int count = 0;
			for(char c : charArray) {
				
				if(map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}
				else {
					
					map.put(c, 1);
				}
				
			}
			System.out.println(map.entrySet());
			
			// to find duplicates
		/*
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
 
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
		*/
		
	}
	public static void main(String[] args) {
		
		countChar("mathumathi");
		
	}

}
