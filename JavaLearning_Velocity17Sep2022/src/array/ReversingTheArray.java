package array;

public class ReversingTheArray {
	
	public static void main(String[] args) {
		
		int [] a = { 11,22,33,44,55};
		
		// This is printing array in normal way 
		for(int i =0; i<5; i++) {
			System.out.println(a[i]);
		}
		System.out.println(" ");
		
		
		// This one is for reversing the array 
		
		for (int j = 4; j>=0; j--)
		{
			System.out.println(a[j]);
		}
	}

}
