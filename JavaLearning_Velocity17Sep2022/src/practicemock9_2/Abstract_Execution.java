package practicemock9_2;

public class Abstract_Execution extends Abstract_Child1 {
	
	public  void CarInsurance() {
		System.out.println("car insurance");
	}
	
	
	
	public static void main(String[] args) {
		Abstract_Execution ob = new Abstract_Execution();
		
		ob.MutualFund();
		ob.CarInsurance();
	}

}
