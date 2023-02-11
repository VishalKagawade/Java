package Demo3;

public class ConstructorInitializing {
	
	int a;
	int b;
	int c;
	
	public ConstructorInitializing (int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	public static void main(String[] args) {
		ConstructorInitializing ob = new ConstructorInitializing(55,80,95);
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		
	}

}
