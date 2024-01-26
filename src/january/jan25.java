package january;

import java.util.Map;

public class jan25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array - We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
	//Array 2 - Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers
//Map1: Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
//Map2: Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
//Map 3: Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
//Map 4: Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter"
//Map 5: Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts"
//Map 6: Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
//Map 7: Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
		
		
		//mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
		//mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
		//mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
		//topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
		//topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
		//topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
		//mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
		
		
	//isEverywhere([1, 2, 1, 3], 1) → true
		//sum67([1, 1, 6, 7, 2]) → 4
		int[] nums = {1, 1, 6, 10, 7, 2};
		System.out.println(sum67(nums));
		
	}

	public boolean isEverywhere(int[] nums, int val) {
  
  boolean result = true;

  for(int i=0; i<=nums.length-2; i++){
    if(nums[i]!=val && nums[i+1]!=val)
     result = false;
    
 }
   return result;
}
public static int sum67(int[] nums) {

int result = 0;
int c = 0;
for(int i=0; i<nums.length; i++){
  
  if(nums[i]==6){
    
    
    for(int j=i; nums[j]!=7 ; j++){
      nums[j]=0;
     c = j;
    
    }
    nums[c+1]=0;
    
    
  }
  else {
    result = result + nums[i];
  }
  
}


return result;
}

public static Map<String, String> mapBully(Map<String, String> map) {
  
 if(map.containsKey("a")){
   map.put("b",map.get("a"));
   map.put("a", "");
 }
  return map;
  
  
}
public static Map<String, String> mapShare(Map<String, String> map) {
  
  if(map.containsKey("a")){
    
    map.put("b", map.get("a"));
    map.remove("c");
    
  }
  else {
        map.remove("c");
  }
  return map;
  
  
}

public static Map<String, String> mapAB(Map<String, String> map) {
  
  if(map.containsKey("a") && map.containsKey("b")){
    
    map.put("ab", map.get("a")+map.get("b"));
    
  }
  
  return map;
}



public static Map<String, String> topping1(Map<String, String> map) {
  
  if(map.containsKey("ice cream")){
    map.put("ice cream", "cherry");
    map.put("bread", "butter");
  }
  else {
    map.put("bread", "butter");
  }
  return map;
  
}
public static Map<String, String> topping2(Map<String, String> map) {
  
  if(map.containsKey("ice cream")){
    map.put("yogurt", map.get("ice cream"));
  }
  if(map.containsKey("spinach")){
    map.put("spinach","nuts");
  }
  
  return map;
}

public static Map<String, String> topping3(Map<String, String> map) {
  
  if(map.containsKey("potato")){
    map.put("fries", map.get("potato"));
  }
  
  if(map.containsKey("salad")){
    map.put("spinach", map.get("salad"));
  }
  
  return map;
  
}

public static Map<String, String> mapAB2(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")){
  if(map.get("a").equals(map.get("b"))){
    
    map.remove("a");
    map.remove("b");
    
  }
  }
  return map;
  
}


	
}
