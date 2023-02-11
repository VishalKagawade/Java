package practicemock8_2;

public class ChildOverride extends ParentOverride {

	public void M1() {
		System.out.println("M1 is non static from child");
	}
	// M1 is overrided method 
	
     //Condition to achieve overriding 1) Inheritance must be present to achieve overriding. 
    // limitation --> overriding within same class is not possible


	// To understand which method will execute - in overriding jiska object rahega usiki method chalegi.

	public static void main(String[] args) {

		ChildOverride ob1 = new ChildOverride(); // child obj and child ref
		ob1.M1();

		ParentOverride ob2 = new ParentOverride(); // parent obj and parent ref
		ob2.M1();

		ParentOverride ob3 = new ChildOverride(); // child obj and parent ref
		ob3.M1();

		ChildOverride ob4 = new ParentOverride(); // limitation of inheritance , Baap ke naam se ladka pehchana jata
													// hain
													// ladke ke naam se baap nahii

	}

}