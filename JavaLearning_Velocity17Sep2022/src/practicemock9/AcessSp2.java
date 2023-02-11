package practicemock9;

public class AcessSp2  {
	
	public void M2() {
		Acesssp1 ob1 = new Acesssp1 ();
		AcessSp2 ob2 = new AcessSp2 ();
		ob1.M1();
		
		
		System.out.println("Non stat M2");
	}
	
	public static void main(String[] args) {
		AcessSp2 ob3 = new AcessSp2 ();
		ob3.M2();
		
		
	}

}
