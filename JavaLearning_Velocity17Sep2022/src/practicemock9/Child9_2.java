package practicemock9;



public class Child9_2  {
	
	public void M1() {
		System.out.println("M1 running");
		M2();
	}
	
	public void M2() {
		System.out.println("M2 run");
		M1();
	}
	
	public static void main(String[] args) {
		Child9_2 ob = new Child9_2();
		ob.M1();
	}


	

	
}
