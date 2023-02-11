package polymorphism;

public class PolyParent {
	
	static int a = 78;
	int b =88;
	
	public void M1() {
		System.out.println(" non static from parent");
	}
	
	public void M1(int b) {
		System.out.println(" 2 nd non static from parent");
	}
	
	public static void main(String[] args) {
		PolyParent ob = new PolyParent();
		//ob.M1();
		ob.M1(45);
	}
}
