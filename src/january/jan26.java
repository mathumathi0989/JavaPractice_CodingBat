package january;

import java.util.HashMap;
import java.util.Map;

public class jan26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Map 1: Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
//Map 2: Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
//Map 3: Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.		
//Map 4: Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
//Map 5: Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
//Map 6: The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.		
		
		//mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
		//mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
		//word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
		//wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
		//pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
//		/wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
		
		String[] strings = {"a", "b", "a", "c", "b"};
		System.out.println(wordCount(strings));
		
	}

	public static Map<String, String> mapAB3(Map<String, String> map) {
  
  
  if(map.containsKey("a") && map.containsKey("b")){
    
  }
  else if(map.containsKey("a")){
    map.put("b", map.get("a"));
  }
  else if(map.containsKey("b")){
    map.put("a", map.get("b"));
  }
  
return map;
}
public Map<String, String> mapAB4(Map<String, String> map) {

 if(map.containsKey("a") && map.containsKey("b")){
    int aValue = map.get("a").length();
 int bValue = map.get("b").length();
 if(aValue!=bValue){
   if(aValue>bValue){
     map.put("c",map.get("a"));
   }
   else map.put("c", map.get("b"));
 
 }
 else {
   map.put("a","");
   map.put("b", "");
 }
 }

 return map;

}

public static Map<String, Integer> word0(String[] strings) {
  
  HashMap<String,Integer> map = new HashMap<String, Integer>();
  
  for(String s: strings){
    map.put(s,0);
  }
  
  return map;
  
}

public static Map<String, Integer> wordLen(String[] strings) {
  
   Map<String, Integer> map = new HashMap();
  
  for(String s: strings){
    
  map.put(s,s.length());
    
    
  }
  
  return map;
  
}
public Map<String, String> pairs(String[] strings) {
  
 Map<String, String> map = new HashMap();
  
for(String s: strings){
  
  map.put(s.valueOf(s.charAt(0)), s.valueOf(s.charAt(s.length()-1)));
  
}
  return map;
}


public static Map<String, Integer> wordCount(String[] strings) {

 Map<String, Integer> map = new HashMap();
  
for(String s: strings){
  
 if (!map.containsKey(s)) {
      map.put(s, 1);
    }
    else {
      int count = map.get(s);
      map.put(s, count + 1);
    }
  
}
  
return map;  
  
}

	
}
