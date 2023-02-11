package practicemock9;

public class ChCon extends PaCon{
	
	public ChCon() {
		super(67);
		 System.out.println("Child const");
		
	}
	
	public static void main(String[] args) {
		
		new ChCon();
	}

}
