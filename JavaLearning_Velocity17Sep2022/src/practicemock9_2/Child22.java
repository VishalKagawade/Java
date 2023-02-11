package practicemock9_2;

public class Child22 extends child1 {

	@Override
	public void carinsurance() {
		System.out.println("car logic");

	}

	public static void main(String[] args) {

		Child22 obj = new Child22();
		obj.mutualfund();
		obj.goldloan();
		obj.carinsurance();
		Parent.hospitalization();

	}

}
