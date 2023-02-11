package programpracticelogical;

public class Armstrong_Number {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int reminder = 0;
		int result = 0;

		while (temp != 0) {

			reminder = temp % 10;

			result = result + (reminder * reminder * reminder);

			temp = temp / 10;

		}
		
		if (num==result)
			System.out.println("The number is Armstrong Number");
		else
			System.out.println("The number is not a Armstrong Number");

	}
}
