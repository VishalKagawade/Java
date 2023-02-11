package inheritancetypes;

public class SimpleInheritanceChild2 extends SimpleInheritanceParent {
	
	public static void S1() {
		System.out.println("From Child 2");
	}
	
	public static void main(String[] args) {
		SimpleInheritanceChild2 ob = new SimpleInheritanceChild2();
		M1();
		ob.M2();
	}

}
