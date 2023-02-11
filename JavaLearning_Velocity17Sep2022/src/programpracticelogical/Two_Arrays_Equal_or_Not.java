package programpracticelogical;

import java.util.Arrays;

public class Two_Arrays_Equal_or_Not {
	
	public static void main(String[] args) {
		
		int [] a = {11,22,33,44,55};
		int [] b = {66,77,88,99,85};
		int [] c = {11,22,33,44,55};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));
	}

}
