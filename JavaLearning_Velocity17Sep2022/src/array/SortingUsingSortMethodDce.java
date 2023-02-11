package array;

import java.util.Arrays;

public class SortingUsingSortMethodDce {
	
	public static void main(String[] args) {
		
		int [] a = {22,45,334,223,45,778,99,7,6555,778,90,77,55,43,3,5,6,77,66244,56,78,90};
		
		Arrays.sort(a);
		for(int i =a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
