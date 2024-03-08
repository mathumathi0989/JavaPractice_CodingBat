package March;

public class classB {

	public void duplicate(String s) {

		for(int i=0; i<s.length()-1; i++) {
			
			if(s.charAt(i)!=s.charAt(i+1)) {
				System.out.print(s.charAt(i));
			}
		}
	
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 classB obj = new classB();
 obj.duplicate("geeksforgeeks");
	}

}
