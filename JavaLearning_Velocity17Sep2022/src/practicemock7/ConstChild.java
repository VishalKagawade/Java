package practicemock7;

public class ConstChild extends Const {
	
	public ConstChild () {
		super(true);
		System.out.println("Child Con");
	}
	
	public static void main(String[] args) {
		ConstChild ob = new ConstChild();
	}

}
