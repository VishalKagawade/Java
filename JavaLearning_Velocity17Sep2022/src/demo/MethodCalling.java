package demo;

public class MethodCalling { ////calling non static method inside another static method 
int a;
	
	public static void main(String[] args) {
		MethodCalling ob1 =new MethodCalling();
		MethodCalling ob2 =new MethodCalling();
		MethodCalling ob3 =new MethodCalling();
		MethodCalling ob4 =new MethodCalling();
		
		ob1.a=12;
		ob2.a=14;
		ob3.a=20;
		ob4.a=25;
		
		System.out.println(ob1.a);
		System.out.println(ob4.a);
	}
	
}

