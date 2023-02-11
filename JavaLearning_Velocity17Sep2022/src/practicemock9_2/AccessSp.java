package practicemock9_2;
import practicemock9.Acesssp1;
public class AccessSp {
	public void M3() {
		Acesssp1 ob4 = new Acesssp1();
		ob4.M1();
		System.out.println("Non stat outside packeage");
	}
	
	public static void main(String[] args) {
		
		AccessSp ob = new AccessSp ();
		ob.M3();
		
	}

}
