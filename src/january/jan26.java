package january;

import java.util.Map;

public class jan26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Map 1: Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
//Map 2: Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
		
		
		//mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
		//mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
		
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

	
}
