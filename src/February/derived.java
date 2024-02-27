package February;

public class derived extends base{

	private int data;
	public derived() {
		data = 6;
	}
	public int getData() {
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
derived myData = new derived();
System.out.println(myData.getData());
	}

}
