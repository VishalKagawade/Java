package array;

public class ArrayInMethodFindMaxNumb {
	
	public static void M1(int [] a) {
		int g =a[0];
		for(int i=1; i<a.length; i++) {
			if(g<a[i])
				g=a[i];
		}
		System.out.println(" highest value present in array " + g);
	}
	
	public static void main(String[] args) {
		int [] a = { 5,10,33,76,12,15,3,2};
		M1(a);
	}

}
