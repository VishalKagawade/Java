package practicemock8;

public class PractInhChild3 extends PractInhChild2 {
	
	public static void main(String[] args) {
		PractInhChild3 ob = new PractInhChild3();
		
		ob.MutualFunds();
		ob.GoldLoan();
		ob.hospitalization();
		ob.facilities();
		PractInhParent.insurance();
	}

}
