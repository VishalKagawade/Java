package exception;

public class ThrowKeyword {
	
	public void totalmarks(int marks) {
		if(marks<=40)
			throw new IllegalArgumentException("Failed");
		else 
			System.out.println("Passed");
	}
	
	public static void main(String[] args) {
		ThrowKeyword ob = new ThrowKeyword();
		ob.totalmarks(39);
		ob.totalmarks(55);
	}

}
