package array;

public class SortingInDescending {

	public static void main(String[] args) {

		int[] a = { 33, 22, 1, 56, 744, 67, 89, 34, 5, 11, 2, 33, 45, 6, 78, 9, 9, 0, 55, 67777, 88, 454, 32, 22, 33,
				45, 6, 7, 543, 22, 34, 4, 99 };
		int empty;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] < a[j]) 
				{
					empty = a[i];
					a[i] = a[j];
					a[j] = empty;
				}
				
			}
			System.out.print(a[i] + " ");
			
		}

	}

}
