package stringmethods;

public class SubStringBeginAndEnd {
	
	// substring(int beginIndex, int endIndex)
	
	public static void main(String[] args) {
		String s ="automation";
		
		String var = s.substring(0,4);  // here we specified end index as 4 but it will show one char
												//before 4 i.e instead m it will show o
		
		System.out.println(var);
	}

}
