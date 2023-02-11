package practicemock8;

public class ArrayPractMock8 {

	public static void main(String[] args) {

		int[] a = { 11, 22, 12, 3, 21, 4, 2, 5, 89, 7, 65, 4, 3, 2, 2, 223, 44, 555, 56666, 66 };
		int empty;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					empty = a[i];
					a[i] = a[j];
					a[j] = empty;
				}
				System.out.print(a[i] + " ");
			}
			
		}

	}

}
