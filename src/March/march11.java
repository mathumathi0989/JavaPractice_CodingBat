package March;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class march11 {

	
	public static void duplicates(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] charArray = s.toCharArray();
		for(char c : charArray) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}
		else {
			map.put(c, 1);
		}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicates("automation");
	}

}
