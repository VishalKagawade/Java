package practice1;

public class MockChild extends Mock5A{
	
	public MockChild(boolean b) {
		//super(5.4f);
		System.out.println(" Child con1");
	}
	
	public MockChild(int s) {
		this(true);
		System.out.println(" Child con2");
	}
	public static void main(String[] args) {
		new MockChild(67);
		 
	}



}
