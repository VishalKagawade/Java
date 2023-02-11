package accessspecifiers1;

public class Test2 extends Test1  {
	
	static int a = 25;
	int b = 35;
	
	void M1() {
		System.out.println("M1 in same package");
	}
	
	public static void main(String[] args) {
		Test1 ob = new Test1(); 
		ob.M1();
		Test1.M2();
		System.out.println(Test1.a);
		System.out.println(ob.b);
		System.out.println(a);
		Test2 obj = new Test2();
		obj.M1();
	}

}
