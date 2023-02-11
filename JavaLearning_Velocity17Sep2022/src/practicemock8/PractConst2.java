package practicemock8;

public class PractConst2 extends PractConst {
	
	static private int d = 120;
	
	public PractConst2 (int a) {
		super(25);
		System.out.println(" Const from child ");
	}
	
	public static void main(String[] args) {
		new PractConst2(78);
		
	}

}
