package Demo3;

public class Constructor2 {
	
	public Constructor2() {
		this(true, 55);
		System.out.println("I am a constructor without arguements");
	}
	
	public Constructor2(boolean x, int a) {
		this(56);
		System.out.println("I am a constructor with two arguements");
	}
	public Constructor2(int b) {
		System.out.println("I am a constructor with one arguement");
	}
	
	public static void main(String[] args) {
		new Constructor2();
	}

}
