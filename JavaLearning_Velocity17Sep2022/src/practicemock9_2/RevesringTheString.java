package practicemock9_2;

public class RevesringTheString {
	
	public static void main(String[] args) {
		
		String s ="vishal";
		String rev="";
		
		for(int i = s.length()-1; i>=0; i--) {
			rev=rev + s.charAt(i);
		}
		
		
		System.out.println("reverse - " + rev);
		
	
	}

}
