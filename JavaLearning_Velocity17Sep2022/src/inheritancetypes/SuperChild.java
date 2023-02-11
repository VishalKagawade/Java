package inheritancetypes;

public class SuperChild extends SuperParent{
	
	static int a =55;
	int b = 65;
	
	public static void K2() {
		SuperParent ob = new SuperParent();
		System.out.println(SuperParent.a);
		System.out.println(ob.b);
	}
	
	public void K3() {
		System.out.println(b);
		System.out.println(super.b);
	}
	
	public static void main(String[] args) {
		SuperChild ob1 = new SuperChild();
		K2();
		ob1.K3();
	}
	

}
