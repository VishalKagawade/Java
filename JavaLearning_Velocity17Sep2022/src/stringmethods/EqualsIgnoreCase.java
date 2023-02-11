package stringmethods;

public class EqualsIgnoreCase {
	
	// equalsIgnoreCase method
	
	public static void main(String[] args) {
		
		String s = "selenium";
		
		String b = "SELENIUM";
		
		boolean var = s.equalsIgnoreCase(b);
		
		System.out.println(var);
	}

}
