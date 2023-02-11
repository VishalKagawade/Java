package abstraction;

public abstract class Child extends Parent {
	
	public void M1(int b) {
		System.out.println("m1 Non static");
	}

	public static void main(String[] args) {
		//Child ob = new Child();
		//ob.M1();
		//ob.S1();
		//ob.M1(56);
		//ob.V1();
	}

	
	
}
