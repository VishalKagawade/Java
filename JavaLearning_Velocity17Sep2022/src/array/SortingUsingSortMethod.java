package array;

import java.util.Arrays;

public class SortingUsingSortMethod {
	
	public static void main(String[] args) {
		
		int [] a = { 23,667,8,6,4,3,55,77,8,96,6,43,224,5,6,677,888,98,7,66,5,444,33,45,85,4,55,6,7,7,34,89};
		
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	

}
