package array;

public class AnnonymousArray {
	
	public static void M1(int [] a) {
		for ( int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		M1(new int[] {11,22,33,44,55});
	}

}
