package programpracticelogical;

import java.util.Scanner;

public class JavaPract {
	public static void main(String[] args) {

		int num;
		int count = 0;

		System.out.println("Enter the number");
		Scanner ref = new Scanner(System.in);
		num = ref.nextInt();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}

		}

		System.out.println(count);

		if (count > 2)
			System.out.println("Given number is not a prime number");
		else
			System.out.println("Given number is a prime number");

	}
}