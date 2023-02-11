package practicemock9_2;

public class FinalPract {

	public static void main(String[] args) {

		String s = "121";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (rev.equals(s))
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");

	}

}