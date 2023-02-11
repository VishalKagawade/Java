package accessspecifiers2;

import accessspecifiers1.Test1;

public class Test3 extends Test1 {
	static int a =56;
	int b = 78;
	public static void main(String[] args) {
	
		Test3 obj = new Test3();
		obj.M1();
		Test1.M2();
		System.out.println(Test1.a);
		System.out.println(obj.b);
		
		
		
		
	}
}
