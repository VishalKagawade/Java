package array;

import java.util.Arrays;

public class CompareArrays {
	
	public static void main(String[] args) {
		
		int [] a = { 1,2,3,4,5};
		int [] b = {22,1,22,33,3};
		int [] c = {1,2,3,4,5};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a, c));
		
	}

}
