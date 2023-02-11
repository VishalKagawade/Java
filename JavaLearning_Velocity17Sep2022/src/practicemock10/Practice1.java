package practicemock10;

import java.util.Arrays;

public class Practice1 {

	public static void min(int[] a) {
		int g = a[0];
		for (int i = 1; i < a.length; i++) {
			if (g < a[i])
				g = a[i];
			}

			System.out.println("lowest num is - " + g);
		
	}

	public static void main(String[] args) {

		int[] a = { 11, 22, 44, 66, 5, 44, 3, 1, 2 };

		min(a);

	}
}
