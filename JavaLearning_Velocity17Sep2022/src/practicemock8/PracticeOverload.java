package practicemock8;

public class PracticeOverload extends PracticeOverloading {
	
	
	public void M1(boolean a) {
		
		System.out.println(" M1 is non stat from child");}
	
	public void M1(boolean a, int d) {
		
		System.out.println(" M1 is non stat from child");
		}
	public static void main(String[] args) {
		
		PracticeOverload ob1 =  new PracticeOverload();   // Child object and child ref
		ob1.M1();
		ob1.M1(67);
		ob1.M1(true);
		ob1.M1(true,78);        // child ref available 
		
		
		PracticeOverloading ob2 = new PracticeOverloading(); // parent obj and parent ref
		ob2.M1();
		ob2.M1(67);										// overloading -- paappa     overload -- beta
		ob2.M1(false);
		ob2.M1(true,89);                            //  jiska ref rahega usi ki method chalegi  and Ref kisi ka bhi ho
													//  pappa ki method jarur chalegi.
		
		PracticeOverloading ob3= new PracticeOverload ();
		ob3.M1();
		ob3.M1(56);
		ob3.M1(false);
		ob3.M1(false,45);
		
		PracticeOverload ob4 = new PracticeOverloading();  //not possible due to limitation of inheritance
		
		
		
		
		
		
		
		
		
	}

}
