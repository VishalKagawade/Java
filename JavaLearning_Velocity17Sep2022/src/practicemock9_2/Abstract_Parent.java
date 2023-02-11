package practicemock9_2;

public abstract class Abstract_Parent {
	
	// Abstraction --> hiding implementation details  and showing important functionalitlity to end user
	
	
	// Abstraction --> 1) Abstract access specifier or acess modifier (0 -100% unimplemented methods)
	//                   2) Interface (100 % un implemented methods)
	
	
	public abstract void MutualFund();
	
	
	public abstract void CarInsurance();
	
	
	public void GoldLoan() {
		System.out.println("Gold loan ");
	
		
		// you cannot create object of abstract class 
	}
	
	
	

}
