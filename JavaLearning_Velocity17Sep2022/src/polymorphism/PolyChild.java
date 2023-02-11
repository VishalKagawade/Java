package polymorphism;

public class PolyChild extends PolyParent {
	
	public void t1(int b, boolean c) {
		System.out.println("t1 is overloading method of child");
	}
	
	
	
	 public static void main(String[] args) {
		 PolyChild obj =new PolyChild(); // child obj child ref
		 obj.t1();
		 obj.t1(45);
		 obj.t1(56,true);
		 
		 System.out.println(" ");
		 
		 PolyParent obj1 = new PolyParent(); // parent obj parent ref 
		 obj1.t1();
		 obj1.t1(56);
		 obj1.t1(67,false);  // child method cannot be called
		 
		 System.out.println(" ");
		 
		 
		 PolyParent obj2 = new PolyChild();  // child obj parent ref
		 obj2.t1();
		 obj2.t1(78);
		 obj2.t1(78,false);  // cannot call child method
		 
		 PolyChild obj3 = new PolyParent (); // not possible due to limitation of inheritance
		 
		 
	}

}
