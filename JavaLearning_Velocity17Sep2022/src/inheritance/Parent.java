package inheritance;

public class Parent {
	
	public static void M1() {
		System.out.println("M1 is static");
	}
	
	public void M2() {
		System.out.println("M2 is non static");
	}
	
	public static void main(String[] args) {
		M1();
		Parent ob = new Parent();
		ob.M2();
	}

}
