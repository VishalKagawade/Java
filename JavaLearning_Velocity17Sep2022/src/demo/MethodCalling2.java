package demo;

public class MethodCalling2 {
	
	int a;
	

	
	public static void main(String[] args) {
		MethodCalling2 ob1 =new MethodCalling2();
		MethodCalling2 ob2 =new MethodCalling2();
		MethodCalling2 ob3 =new MethodCalling2();
		MethodCalling2 ob4 =new MethodCalling2();
		
		ob1.a=12;
		ob2.a=14;
		ob3.a=20;
		ob4.a=25;
		
		System.out.println(ob4.a);
		
	}

}
