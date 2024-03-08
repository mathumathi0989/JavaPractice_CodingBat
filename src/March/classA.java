package March;

import java.util.HashMap;
import java.util.HashSet;

public class classA {

	public static void duplicate(String s) {
		
		HashSet map = new HashSet<String>();
		for(int i=0; i<s.length(); i++ )
		{		map.add(s.charAt(i));
		}
		String s1 = map.toString();
	System.out.print(s1);
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicate("geeksforgeeks");
	}

}
