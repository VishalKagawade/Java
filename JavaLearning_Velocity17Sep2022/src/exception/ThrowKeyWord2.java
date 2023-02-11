package exception;

public class ThrowKeyWord2 {
	
	public void totalmarks(int marks ) {
		if(marks<=40)
			throw new IllegalArgumentException("failed");
		else
			System.out.println("Passed");
	}
	
	public static void main(String[] args) {
		ThrowKeyWord2 obj = new ThrowKeyWord2();
		try {
		obj.totalmarks(39);
		}
		catch (IllegalArgumentException ref1) {
	System.out.println(ref1.getMessage());
		}
		
		obj.totalmarks(78);
	}

}
