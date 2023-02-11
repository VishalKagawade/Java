package stringmethods;

public class IndexOfChar {
	
	// indexOf(char ch) method
	
	public static void main(String[] args) {
		String s = "automation";
		
		int var = s.indexOf('o');
		System.out.println(var);   //  it will return the index where it finds o for first time it will not go for
												// any other o after first one
	}

}
