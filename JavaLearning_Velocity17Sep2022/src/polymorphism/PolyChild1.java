package polymorphism;

public class PolyChild1 extends PolyParent {
	
	static int a =56;
	int b =45;
	
	abstrct void S2();
	
	public void M1() {
		System.out.println(" non static from child");
	}
	
	
	public static void main(String[] args) {
		
		PolyChild1 ob = new PolyChild1();
		System.out.println(PolyParent.a);
		System.out.println(ob.b);
		
		System.out.println(" ");
		
		PolyParent obj = new PolyParent ();
		System.out.println(PolyParent.a);
		System.out.println(obj.b);
		
		System.out.println(" ");
		
		PolyParent obj1 = new PolyChild1();
		System.out.println(PolyParent.a);
		System.out.println(obj1.b);
		
		
	
	
		
		//PolyChild1 ob = new PolyChild1();
		//ob.M1();
		
		//PolyParent ob2 = new PolyParent();
		//ob2.M1();
		
		//PolyParent ob3 = new PolyChild1();
		//ob3.M1();
		
		//PolyChild1 ob4 = new PolyParent ();
		
		
		
		
		
	}
		

}
